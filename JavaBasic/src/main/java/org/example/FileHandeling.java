package org.example;

import java.io.*;

public class FileHandeling {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello file");
        fw.close();
    }
}

