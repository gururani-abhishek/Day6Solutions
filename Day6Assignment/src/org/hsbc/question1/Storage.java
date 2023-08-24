package org.hsbc.question1;

import java.io.IOException;

public interface Storage {

    // -> takes String array of lines as input and enters them all in the file called fileName
    public void addProseToTheFile(String[] lines, String fileName) throws IOException;

}
