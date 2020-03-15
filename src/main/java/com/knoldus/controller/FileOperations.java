package com.knoldus.controller;

import com.knoldus.model.ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FileOperations implements ReadFile {
    @Override
    public List<String> readData(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

    public HashMap<String, Integer> getWordsCount(List<String> dataList) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        dataList
                .forEach(str -> Arrays.stream(str.split(" "))
                        .forEach(word -> {
                            if (wordCount.containsKey(word)) {
                                wordCount.replace(word, wordCount.get(word) + 1);
                            } else {
                                wordCount.put(word, 1);
                            }
                        }));

        return wordCount;

    }

}
