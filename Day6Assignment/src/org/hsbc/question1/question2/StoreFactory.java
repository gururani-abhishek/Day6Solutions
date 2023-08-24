package org.hsbc.question1.question2;

import org.hsbc.question1.Storage;

import java.io.File;
import java.io.IOException;

// it's always a good practice to have an interface for the factory class ->
public interface StoreFactory {
    Storage createStorageFileObject(String file) throws IOException;

}
