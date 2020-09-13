package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        int c;
        try{
            LowerCaseInputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                new FileInputStream("test.txt")
                            )
                    );

            while((c = in.read()) >=0 ){
                System.out.print((char)c);
            }

        }catch (IOException e){

        }
    }
}
