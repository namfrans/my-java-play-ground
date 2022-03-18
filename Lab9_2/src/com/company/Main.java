package com.company;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        try{
            input = new Scanner(new BufferedReader(new FileReader("/Files/datafile.rtf")));

            while (input.hasNext())
                System.out.println(input.next());
        }finally {
            if (input != null)
                input.close();
        }
    }
}
