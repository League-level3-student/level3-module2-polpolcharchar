package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
        boolean result = true;
    	for(int i = 0; i < arr.length; i++) {
    		
    		for(int j = 0; j < arr.length - 1; j++) {
    			
    			if(arr[j] > arr[j + 1]) {
    				result = false;
    			}
    			
    		}
    		
    	}
    	
    	
    	
        return result;
    }
    
    public static boolean doubleArraySorted(double[] arr) {
    	boolean result = true;
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length - 1; j++) {
    			if(arr[j] > arr[j + 1]) {
    				result = false;
    			}	
    		}	
    	}
    	return result;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */


    public static boolean charArraySorted(char[] arr) {
    	boolean result = true;
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length - 1; j++) {
    			if(arr[j] > arr[j + 1]) {
    				result = false;
    			}	
    		}	
    	}
    	return result;
    }
    
    
    
    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */

    public static boolean stringArraySorted(String[] arr) {
    	boolean result = true;
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length - 1; j++) {
    			if(arr[j].compareTo(arr[j + 1]) > 0) {
    				result = false;
    			}	
    		}	
    	}
    	return result;
    }
    

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */

}
