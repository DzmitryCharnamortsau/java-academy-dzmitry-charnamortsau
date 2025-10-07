package com.pluralsight;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, ");
            writer.write("World!\n");
            writer.write("One more line goes here\n");
            writer.write("And another one");
            writer.close();
        }
        catch(IOException ex){
            System.out.println("File not found!");
            ex.printStackTrace();
        }
        try{
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufReader = new BufferedReader(reader);
            String input;
            int lineNumber = 1;
            while((input = bufReader.readLine()) !=null){
                System.out.println(lineNumber + " " + input);
                lineNumber ++;
            }
        }
        catch(IOException exception){
            System.out.println("Action can't be completed!");
            exception.printStackTrace();
        }
    }
}