/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indigo.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * This class is to find the largest product in a series.
 * 
 * @author vianicervantes
 */
public class Exercise1 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of test cases:");
            int T = scanner.nextInt();
            scanner.nextLine();
            if(!validateTestCases(T)){
                  throw new Exception ();
            }
            List<Integer> results =new ArrayList<>();
            for (int i=0;i<T;i++){
                System.out.println("Enter number of digits and the consecutive digits:");
                String[] variables=scanner.nextLine().split("\\s+");
                int N=Integer.parseInt(variables[0]);
                int K=Integer.parseInt(variables[1]);
                System.out.println("Enter the number:");
                Long number = scanner.nextLong();
                scanner.nextLine();
                if(!validateData(N, K)){
                     throw new Exception ();
                }
                results.add(getLargestProduct(N, K, number));
            }
            System.out.println("Results:");
            results.forEach((Integer result) -> System.out.println(result));
        } catch(Exception e){
            System.out.println("The information entered does not comply with the rules");
        }
    }
    
    
    /**
    * This method is to validate the variable number of digits and the number of grouped digits.
    * @param N The number of digits.
    * @param K The number of digits in which it is grouped.
    * @return Boolean Returns true when the conditions are met.
    */
    private static Boolean validateData(int N, int K){
        return (((K>=1) && (K<=7)) && ((K<=N) && (N<=1000)));
    }
    
    /**
    * This method is to validate the variable of Test cases.
    * @param T The number of test cases.
    * @return Boolean Returns true when the conditions are met.
    */
    private static Boolean validateTestCases(int T){
        return ((T>=1) && (T<=100));
    }

    /**
    * This method is to obtain the largest product in a series.
    * @param N The number of digits.
    * @param K The number of digits in which it is grouped.
    * @param number The number from which the largest product in a series will be obtained.
    * @return Integer Returns the largest product.
    */
    public static Integer getLargestProduct(int N, int K,Long number){
        String numberString= number.toString();
        List  <Integer> numbersProduct= new ArrayList<>();
        for(int i=0;i<K;i++){
            Integer partialNumber=Integer.parseInt(numberString.substring(i, K+i));
            int digit=1;
            for(int j=1;j<=K;j++){
                digit *=partialNumber%10;
                partialNumber=partialNumber/10;
            }
            numbersProduct.add(digit);      
        }     
        return numbersProduct.stream()
                              .max(Comparator.comparing(i -> i))
                              .get();
    }
}
