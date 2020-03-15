package com.knoldus.model;


import java.io.IOException;
import java.util.List;

public interface ReadFile {
    List<String> readData(String path) throws IOException;
}
