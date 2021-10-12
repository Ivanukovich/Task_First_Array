package com.epam.firsttaskarray.parser;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.validation.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {
    private static final Logger logger = LogManager.getLogger();

    private static final Validator validator = new Validator();
    private static final String regex_delimiter = "[,]?\\s+";
    private static final String regex_integer = "[-]?\\d+";

    public CustomArray parseLines(List<String> lines) throws CustomException {
        List<Integer> numbers = new ArrayList<>();
        if (lines == null) {
            logger.error("List is empty");
        }
        for (String line : lines) {
            if (validator.validateLine(line)) {
                Pattern pattern = Pattern.compile(regex_integer);
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    numbers.add(Integer.parseInt(matcher.group()));
                }
            }
        }
        if (numbers.size() == 0){
            logger.info("No numbers found");
        }
        CustomArray result = new CustomArray();
        result.setArray(numbers);
        logger.info("Result of parsing: " + result.toString());
        return result;
    }

    public CustomArray parseLines_stream(List<String> lines) throws CustomException {
        if (lines == null) {
            logger.error("List is empty");
            throw new CustomException("List is empty");
        }
        int[] numbers = lines.stream()
                .filter(line -> validator.validateLine(line))
                .flatMap(line -> Arrays.stream(line.split(regex_delimiter)))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (numbers.length == 0){
            logger.error("No numbers found");
        }
        CustomArray result = new CustomArray();
        result.setArray(numbers);
        logger.info("Result of parsing: " + result.toString());
        return result;
    }
}