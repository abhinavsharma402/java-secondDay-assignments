package com.knoldus.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface ReadFile {
    public List<String> readData(String path) throws IOException;
}
