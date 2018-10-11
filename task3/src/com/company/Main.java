package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i < 0) {

            System.out.println(Math.abs(i));
        }

        else {
            System.out.println(i * 2);

        }
    }

}

