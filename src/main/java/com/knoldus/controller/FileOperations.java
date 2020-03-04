package com.knoldus.controller;

import com.knoldus.model.ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileOperations implements ReadFile {
    @Override
    public List<String> readData(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }
    public HashMap<String,Integer> getWordsCount(List<String> dataList){

        HashMap<String,Integer> wordCount=new HashMap<>();

        dataList.stream()
                .map(str-> Arrays.stream(str.split(" "))
                        .map(word->
                                wordCount.containsKey(word)?wordCount.replace(word,wordCount.get(word)+1)
                                        :wordCount.put(word,1)

                        )

                );

        return wordCount;

    }

}
