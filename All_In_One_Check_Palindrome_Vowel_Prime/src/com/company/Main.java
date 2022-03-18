package com.company;

import java.util.Scanner;

public class Main {
    //Function to check if number is prime
        static boolean checkForPrime(int inputNumber) {
            boolean isItPrime = true;

            if (inputNumber <= 1) {
                isItPrime = false;
                return isItPrime;
            } else {
                for (int i = 2; i <= inputNumber / 2; i++) {
                    if ((inputNumber % i) == 0) {
                        isItPrime = false;
                        break;
                    }
                }
                return isItPrime;
            }
        }
        //Function to check if a character is a vowel
        static boolean checkIfVowel(String inputWord){
            boolean isVowel = false;
            String[] vowels = {"a", "e", "i", "o", "u"};
            //This condition is to check if the word is a single character and vowel
            for (int i = 0; i < vowels.length; i++) {
                if (inputWord.equalsIgnoreCase(vowels[i])) {
                    isVowel = true;
                    break;
                }
            }
            return isVowel;
        }
        //Function to check if the inserted word is a palindrome
    static boolean checkIfPalindrome(String insertWord){
            boolean isPalindrome = true;
            int halfString = insertWord.length() / 2;
            int j = insertWord.length() - 1;
        //Check if word is a palindrome
            for(int i = 0; i <= halfString; i++){
                if(insertWord.charAt(i) != insertWord.charAt(j)){
                    isPalindrome = false;
                    break;
                }
                j--;
            }
        return isPalindrome;
    }
    public static void main (String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number/ word / character: ");

         if(input.hasNextInt()){
            // Check if the number entered is prime
            int number = input.nextInt();
            boolean isItPrime = checkForPrime(number);
            if (isItPrime){
                System.out.println(number+" is a prime number.");
            }else {
                System.out.println(number+" is not a prime number.");
            }
        } else if (input.hasNext()) {
             //This condition is to check if the word is a single character and vowel
             String word = input.next();
             if (word.matches("[A-Za-z]{1}")) {
                 boolean isVowel = checkIfVowel(word);
                 if (isVowel){
                     System.out.println(word.toUpperCase() + " is a vowel.");
                 }else {
                     System.out.println(word.toUpperCase() + " is not a vowel.");
                 }
             }else{
                 //Check if world is a palindrome
                 boolean isPalindrome = checkIfPalindrome(word);
                 if(isPalindrome){
                     System.out.println(word+ " is a palindrome.");
                 }else {
                     System.out.println(word+ " is not a palindrome.");
                 }
             }
         }  else {
            System.out.println("Your input is invalid!");
        }
    }

}
