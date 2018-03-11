package demo;

import com.google.common.base.Charsets;
import com.google.common.io.CharSource;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

final class TextFile {

    private final String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String load() {
        try {
            File file = new File(fileName);
            CharSource source = Files.asCharSource(file, Charsets.UTF_8);
            return source.read();
        } catch (IOException e) {
            throw new RuntimeException("Exception during loading the file: " + fileName, e);
        }
    }
}