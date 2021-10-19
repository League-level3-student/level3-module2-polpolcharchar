package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String testValues[] = {"cat", "dog", "frog"};
        assertEquals(0, _01_LinearSearch.linearSearch(testValues, "cat"));
        testValues[0] = "bird";
        assertEquals(-1, _01_LinearSearch.linearSearch(testValues, "cat"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	
    	int[] testValues = {1, 2, 3, 4, 5, 16, 17, 18, 26, 267, 1642};
    	
    	
        assertEquals(10, _02_BinarySearch.binarySearch(testValues, 0, testValues.length, 1642));
        
        assertEquals(-1, _02_BinarySearch.binarySearch(testValues, 0, testValues.length, 126));
    }
}
