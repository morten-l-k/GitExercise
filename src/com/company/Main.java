package com.company;

import java.util.Scanner;

public class Main {
Scanner keyboard = new Scanner(System.in);

        public void greet(){
          System.out.println("Indtast dit navn: ");
          String name = keyboard.next();
          System.out.println("Hej " + name);
        }

        public void age(){
          System.out.println("Indtast din alder: ");
          int age = keyboard.nextInt();
          System.out.println("Din alder er: " + age);
        }

    public static void main(String[] args) {
        Main obj = new Main();

          System.out.println("It Works!");
          obj.greet();
          obj.age();

    }
}
