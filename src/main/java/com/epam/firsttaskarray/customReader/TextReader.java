package com.epam.firsttaskarray.customReader;

import com.epam.firsttaskarray.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextReader {
    private static final Logger logger = LogManager.getLogger();

    public List<String> readText(String filePath) throws CustomException {
        if (filePath == null) {
            logger.error("File path is null");
            throw new CustomException("File path is null");
        }
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            logger.error("File path \"" + filePath + "\" is invalid");
            throw new CustomException("File path is invalid");
        }
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            logger.error("Error while reading the file " + filePath);
            throw new CustomException("Error while reading the file", e);
        }
        logger.info("Finish reading file \"" + filePath + "\"");
        return lines;
    }

    public List<String> readTextStream(String filePath) throws CustomException {
        if (filePath == null) {
            logger.error("File path is null");
            throw new CustomException("File path is null");
        }
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            logger.error("File path \"" + filePath + "\" is invalid");
            throw new CustomException("File path is invalid");
        }
        List<String> lines;
        try (Stream<String> linesStream = Files.lines(Paths.get(filePath))) {
            lines = linesStream.collect(Collectors.toList());
        } catch (IOException e) {
            logger.error("Error while reading the file " + filePath);
            throw new CustomException("Error while reading the file", e);
        }
        logger.info("Finish reading file \"" + filePath + "\"");
        return lines;
    }
}
