package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* StringBuilder aid = new StringBuilder();
        int[] sab = {23,24,25,26};
        for (int nums:sab) {
            System.out.print(nums+" ");
            aid.append(nums);
        }
        System.out.println("\n"+aid+" ");



        fileReader();
    }
    public static void FileWriter(){
        try{
            FileWriter writer = new FileWriter("Aidana");
            writer.write("you");
            writer.write(" must");
            writer.write(" study");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void fileReader(){
        try{
            FileReader reader = new FileReader("Aidana");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());}
                reader.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }*/
       /* fileWriter("Manas university", "i really love my university");
        fileReader("Manas university");

    }
    public static void fileWriter( String fileName, String text) {
       try (FileWriter writer = new FileWriter(fileName)) {
       writer.write(text);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
    public static void fileReader(String name){
        try
                (FileReader reader = new FileReader(name)) {
            Scanner scanner = new Scanner(reader);

            while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());}
        }  catch (IOException e) {
            e.printStackTrace();
        }*/
        fileWriter("Kyrgyzstan", "i love my country");
        fileReader("Kyrgyzstan");

    }
    public static void fileWriter(String fileName, String text){
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileReader(String fileName){
        try(FileReader reader = new FileReader(fileName)){
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
