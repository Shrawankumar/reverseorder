package com.hsbc.filereader;


import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Component
public class FileUtil {

    public  String  readFileContent(){

        String content ="";
        try {
            Path path =  Paths.get(ClassLoader.getSystemResource("input.txt").toURI());
            content = Files.readString(path, StandardCharsets.US_ASCII);
        } catch (URISyntaxException | IOException e) {

            System.err.println("File is not present in resource path");
        }
        return content;
    }


    public void wroteToFile(String content){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            bufferedWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
