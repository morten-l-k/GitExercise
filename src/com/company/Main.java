package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
Scanner keyboard = new Scanner(System.in);

        public void greet(){
          System.out.println("Indtast dit navn: ");
          String sc = keyboard.next();
          System.out.println("Hej " + sc);
        }
    public static void main(String[] args) {
        Main obj = new Main();

          System.out.println("It Works!");
          obj.greet();

    }
}
