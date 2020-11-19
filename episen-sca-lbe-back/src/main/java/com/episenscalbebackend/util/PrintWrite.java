package com.episenscalbebackend.util;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PrintWrite {

    public static void write(String order){
        try{
            try{
                Files.write(Paths.get("orders.txt"), order.getBytes(),
                        StandardOpenOption.APPEND);
            } catch(NoSuchFileException e){
                FileWriter orderFile = new FileWriter("orders.txt");
                orderFile.write(order);
                orderFile.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
