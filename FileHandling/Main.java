package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter Some letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();

            }
            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader fr = new FileReader("note.txt")){
            int letter = fr.read();
            while(fr.ready()){
                System.out.println((char) letter);
                letter = fr.read();

            }
            fr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
