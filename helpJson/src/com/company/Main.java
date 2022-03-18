package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String[] myNames = new String[4];
            for (int i = 0; i < 4; i++) {
                System.out.println("Insert your name: ");
                myNames[i] = input.next();

                System.out.println("-----------------"+"\nYou is: "+myNames[i]+"\n-----------------");

            if ( i == 3) {
                System.out.println("My names array= " + Arrays.toString(myNames));
            }

            }

    }
    static void Choose(int index){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose name by entering it's index.");
        index = input.nextInt();
    }
}
