/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indigo.exercises;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author vianicervantes
 */
public class TestExercise2 {
    @Test
    public void Test(){
        Integer largestPalindromProduct=Exercise2.getLargestPalindrome(101110);
        assertTrue(largestPalindromProduct==101101);
        largestPalindromProduct=Exercise2.getLargestPalindrome(800000);
        assertTrue(largestPalindromProduct==793397);
    }
}
