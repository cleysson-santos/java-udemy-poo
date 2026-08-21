package Excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyTest {
    static void main(String[] args) {
        File file = new File("C:\\temp\\in.text");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if(sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
