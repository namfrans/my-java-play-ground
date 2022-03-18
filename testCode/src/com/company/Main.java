package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberStudents = keyboard.nextInt();
        Student students[] = new Student[numberStudents];
        keyboard.nextLine();
        for (int i = 0; i < numberStudents; i++) {
            String values[] = keyboard.nextLine().split(" ");
            students[i] = new Student(values[0], values[1], Integer.parseInt(values[2]), values[3]);
        }
        for (int i = 0; i < numberStudents; i++) {
            System.out.println(students[i].toString());
        }
        keyboard.close();
    }
}
