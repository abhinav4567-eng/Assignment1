package com.capgemini.programs;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive=0;
        int negative=0;
        int zero=0;
        for(int a:arr){
            if(a>0)
            positive++;
            if(a<0)
            negative++;
            if(a==0)
            zero++;
        }
        System.out.printf("%1.6f%n",(double)positive/arr.length);
    System.out.printf("%1.6f%n",(double)negative/arr.length);
    System.out.printf("%1.6f%n",(double)zero/arr.length);


    }

    private static final Scanner scanner = new Scanner(System.in);
    
    

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

