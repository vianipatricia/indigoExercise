/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indigo.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class is to find the largest palindrome product.
 * @author vianicervantes
 */
public class Exercise2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of test cases:");
            int T = scanner.nextInt();
            scanner.nextLine();
            if (!validateTestCases(T)) {
                throw new Exception();
            }
            List<Integer> results = new ArrayList<>();
            for (int i = 0; i < T; i++) {
                System.out.println("Enter the number:");
                Integer number = scanner.nextInt();
                scanner.nextLine();
                if (!validateData(number)) {
                    throw new Exception();
                }
                results.add(getLargestPalindrome(number));
            }
            System.out.println("Results:");
            results.forEach((Integer result) -> System.out.println(result));
        } catch (Exception e) {
            System.out.println("The information entered does not comply with the rules");
        }
    }

    /**
    * This method is to validate the number entered.
    * @param N The number to calculate the largest palindrome product.
    * @return Boolean Returns true when the conditions are met.
    */
    private static Boolean validateData(long N) {
        return (((101101 < N) && (N < 1000000)));
    }

    /**
    * This method is to validate the variable of Test cases.
    * @param T The number of test cases.
    * @return Boolean Returns true when the conditions are met.
    */
    private static Boolean validateTestCases(int T) {
        return ((T >= 1) && (T <= 100));
    }

    /**
    * This method is to obtain the largest palindrome product.
    * @param number The number from which the largest palindrome product start.
    * @return Integer Returns the largest palindrome product.
    */
    public static int getLargestPalindrome(int number) {
       int max = 0;
        for(int i = 999; i > 100; i--) {
            for(int j = 999; j > 100; j--) {
                int prod = i*j;
                String s = Integer.toString(prod);
                String s2 = new StringBuffer(s).reverse().toString();
                if(s.equals(s2)) {
                    if (prod > max && prod<number) { 
                     max = prod;
                    }
                }
            }       
        }
        return max;
    }
}
