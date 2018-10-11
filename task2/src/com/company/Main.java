package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        argument();


    }
    static void argument() {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        System.out.println("Hello " + name);
    }
}
