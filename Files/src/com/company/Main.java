package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader InputStream = null;
        BufferedWriter OutputStream = null;

        try{
            InputStream = new BufferedReader(new FileReader("/PRG610S/LABS/LAB9/inputfile.rtf"));
            OutputStream = new BufferedWriter(new FileWriter("/PRG610S/LABS/LAB9/outputfile.rtf"));
        }finally {
            if (InputStream != null)
                InputStream.close();
            if (OutputStream != null)
                OutputStream.close();
        }

    }
}
