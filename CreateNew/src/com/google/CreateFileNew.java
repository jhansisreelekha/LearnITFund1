package com.google;

import java.io.File;
import java.io.IOException;

public class CreateFileNew {
    public static void main(String[] args) {
        String filePath = "C:/Users/Pavuluri J S/Documents/file3.txt";

        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("New file created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

