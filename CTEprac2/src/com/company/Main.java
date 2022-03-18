package com.company;

import java.util.Locale;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringTokenizer st = new StringTokenizer("Hello this my first = compiler + play )", " ");
        StringTokenizer st1 = new StringTokenizer("Hello this my first = compiler + play )", " ");

        int i = 0;
        while (st.hasMoreTokens()){
            i = i + 1;
            String myToken = st.nextElement().toString();
            if(myToken.equalsIgnoreCase(")") || myToken.equalsIgnoreCase("=") || myToken.equalsIgnoreCase("+")){
                myToken = "unidentified";
            }
            System.out.println("TOKEN #"+ i +" "+myToken);
        }
        System.out.print("Number of tokens detected is: "+ st1.countTokens());
    }
}
