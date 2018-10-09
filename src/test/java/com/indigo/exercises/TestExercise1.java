/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indigo.exercises;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * This class is to test Exercise1.
 * 
 * @author vianicervantes
 */
public class TestExercise1 {
    
    @Test
    public void Test(){
        Integer largestProduct=Exercise1.getLargestProduct(10, 5, 3675356291L);
        assertTrue(largestProduct==3150);
        largestProduct=Exercise1.getLargestProduct(10, 5, 2709360626L);
        assertTrue(largestProduct==0);
    }
}
