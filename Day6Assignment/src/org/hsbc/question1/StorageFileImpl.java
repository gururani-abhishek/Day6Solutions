package org.hsbc.question1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StorageFileImpl implements Storage {
    private BufferedWriter bufferedWriter = null;

    // -> constructor to instantiate bufferedWriter instance
    public StorageFileImpl(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        bufferedWriter = new BufferedWriter(fileWriter);
    }
    // -> using buffered writer adding lines to bufferedReader and then finally adding all those files in the form of prose
    // -> to file called fileName
    @Override
    public void addProseToTheFile(String[] lines, String fileName) throws IOException {
        for(int idx = 0; idx < lines.length; idx++) {
            bufferedWriter.write(lines[idx] + "\n");
        }
        bufferedWriter.flush(); // -> flushing the buffered reader to finally reflect all the added lines in the file
    }
}
