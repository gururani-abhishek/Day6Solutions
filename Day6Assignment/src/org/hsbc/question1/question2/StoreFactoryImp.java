package org.hsbc.question1.question2;

import org.hsbc.question1.Storage;
import org.hsbc.question1.StorageFileImpl;

import java.io.File;
import java.io.IOException;

// this is question 2, because it's being used in the previous question I've created a package -> question2 inside an already
// existing package called org.hsbc.question1
public class StoreFactoryImp implements StoreFactory {

    @Override
    public Storage createStorageFileObject(String fileName) throws IOException {
        return new StorageFileImpl(fileName); // returns an object of type StorageFileImpl
    }
}
