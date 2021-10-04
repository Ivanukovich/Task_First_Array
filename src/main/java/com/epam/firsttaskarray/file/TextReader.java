package com.epam.firsttaskarray.file;

import com.epam.firsttaskarray.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
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
    private static final Logger logger = LoggerFactory.getLogger(TextReader.class);

    public List<String> readText(String filePath) throws CustomException {
        validateFilePath(filePath);
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            logger.error("file path is invalid");
            throw new CustomException("Error while reading file", e);
        }
        return lines;
    }

    public List<String> readText_Stream(String filePath) throws CustomException {
        validateFilePath(filePath);
        List<String> lines;
        try (Stream<String> linesStream = Files.lines(Paths.get(filePath))) {
            lines = linesStream.collect(Collectors.toList());
        } catch (IOException e) {
            logger.error("Error while file reading");
            throw new CustomException("Error while file reading", e);
        }
        return lines;
    }
    private void validateFilePath(String filePath) throws CustomException {
        if (filePath == null) {
            logger.error("file path is null");
            throw new CustomException("file path is null");
        }
        File file = new File(filePath);
        if (!file.exists()) {
            logger.error("file doesn't exist");
            throw new CustomException("file doesn't exist");
        }
        if (file.isDirectory()) {
            logger.error("file by path is not directory");
            throw new CustomException("file by path is not directory");
        }
    }
}
