/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alekseev.maintask01.task01.model.logic;

import by.epam.javatraining.alekseev.maintask01.model.exception.BadArgumentException;
import org.junit.Test;
import static org.junit.Assert.*;

public class VectorTest {
    
    public VectorTest() {
    }

    @Test
    public void testGetMaxElement() throws BadArgumentException {
        double[] array = null;
        double expResult = 0.0;
        double result = Vector.getMaxElement(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetMinElement() throws BadArgumentException {
        double[] array = null;
        double expResult = 0.0;
        double result = Vector.getMinElement(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetArithmeticAverage() throws BadArgumentException {
        System.out.println("getArithmeticAverage");
        double[] array = null;
        double expResult = 0.0;
        double result = Vector.getArithmeticAverage(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetGeometricAverage() throws BadArgumentException {
        double[] array = null;
        double expResult = 0.0;
        double result = Vector.getGeometricAverage(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsSorted() throws BadArgumentException  {
        double[] array = null;
        boolean expResult = false;
        boolean result = Vector.isSorted(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionOfFirstLocalMin() {
        double[] array = null;
        int expResult = 0;
        int result = Vector.getPositionOfFirstLocalMin(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionOfFirstLocalMax() {
        double[] array = null;
        int expResult = 0;
        int result = Vector.getPositionOfFirstLocalMax(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testLinearSearch() {
        double[] array = null;
        double key = 0.0;
        int expResult = 0;
        int result = Vector.linearSearch(array, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testDoBinarySearch() {
        double[] array = null;
        double key = 0.0;
        int expResult = 0;
        int result = Vector.doBinarySearch(array, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testFlip() {
        double[] array = null;
        Vector.flip(array);
    }

    @Test
    public void testBubbleSortAsc() {
        double[] array = null;
        Vector.bubbleSortAsc(array);
    }

    @Test
    public void testModified1BubbleSortAsc() {
        double[] array = null;
        Vector.modified1BubbleSortAsc(array);
    }

    @Test
    public void testModified2BubbleSortAsc() {
        double[] array = null;
        Vector.modified2BubbleSortAsc(array);
    }

    @Test
    public void testInsertionSortAsc() {
        double[] array = null;
        Vector.insertionSortAsc(array);
    }

    @Test
    public void testSelectionSortAsc() {
        double[] array = null;
        Vector.selectionSortAsc(array);
    }

    @Test
    public void testMergeSortAsc() {
        double[] array = null;
        Vector.mergeSortAsc(array);
    }

    @Test
    public void testQuickSort() {
        double[] array = null;
        int f = 0;
        int l = 0;
        Vector.quickSort(array, f, l);
    }
    
}
