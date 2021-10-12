package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }
Random r = new Random();
    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        while(true) {
        	display.updateDisplay();
        	boolean finished = true;
        	for(int i = 0; i < array.length; i++) {
        		for(int j = 0; j < array.length - 1; j++) {
        			if(array[j] > array[j + 1]) {
        				finished = false;
        			}
        		}
        	}
        	if(finished) {
            	System.out.println("done!!!");
            }else {
            	int index1 = r.nextInt(array.length);
            	int index2 = r.nextInt(array.length);
            	int temp = array[index1];
            	array[index1] = array[index2];
            	array[index2] = temp;
            	String print = "";
            	for(int i = 0; i < array.length; i++) {
            		print += "" + array[i];
            	}
            	System.out.println(print);
            	System.out.println("swapped");
            }
        }
        
    }
    
}
