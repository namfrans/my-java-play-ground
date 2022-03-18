package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kbd= new  Scanner(System.in);
        System.out.println("Enter a number < 8: ");
        int number = kbd.nextInt();
        String[] myArr = new String[number];
        for (int i = 0; i < myArr.length; i++){
            System.out.println("Enter a fruit: ");
            myArr[i] = kbd.next();
        }
        ArrayList<String> list = new ArrayList<String>();
        for(int j = 0; j < myArr.length; j++){
            for (int k = j + 1; k < myArr.length; k++){
                if (myArr[j].length() < myArr[k].length()){
                    list.add(myArr[k]);
                }else{
                    list.add(myArr[j]);
                }
            }
        }
        String[] longStrs = list.toArray(new String[list.size()]);
        //Sort the array
        Arrays.sort(longStrs);
        // find the max frequency using linear
        // traversal
        int max_count = 1;
        String res = longStrs[0];
        int curr_count = 1;

        for (int i = 1; i < longStrs.length; i++) {
            if (longStrs[i] == longStrs[i - 1]){
                curr_count++;
            }
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = longStrs[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count) {
            max_count = curr_count;
            res = longStrs[longStrs.length - 1];
        }

        System.out.println(Arrays.toString(myArr) + "\n");
        System.out.println("The longest word in array is: "+ res);
    }
}
