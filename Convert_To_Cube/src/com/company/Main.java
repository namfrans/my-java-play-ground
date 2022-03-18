package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int number;
       String word;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number or a word: ");
        if(input.hasNextInt()){
            number = input.nextInt();
            int cube = number*number*number;
            System.out.println(number +" to the power 3 = "+ cube);
        }else if (input.hasNext()){
            word = input.nextLine();
            String part1 = word.substring(0, word.length()/2);
            String part2 = word.substring(word.length()/2);
            System.out.println(word +" words are = " + part1 + " and "+ part2);
        }else {
            System.out.println("Entered a wrong input!");
        }


    }
}
