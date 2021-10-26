package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + (num1*num2);
    }
    public static boolean isPrime(int num) {
    	boolean result = true;
    	for(int i = 2; i < num-1; i++) {
    		if((double) num / i == num / i) {
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
    public static boolean isSquare(int num) {
    	for(int i = 0; i < num + 1; i++) {
    		if(i * i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    public static boolean isCube(int num) {
    	for(int i = 0; i < num + 1; i++) {
    		if(i * i * i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return eggs.indexOf("cracked");
    }
    public static int countPearls(List<Boolean> arr) {
    	int result = 0;
    	for(boolean pearl: arr) {
    		if(pearl) {
    			result ++;
    		}
    	}
    	return result;
    }
    public static double findTallest(List<Double> arr) {
    	double tallest = 0;
    	for(Double height : arr) {
    		if(height > tallest) {
    			tallest = height;
    		}
    	}
    	return tallest;
    }
    public static String findLongestWord(List<String> arr) {
    	String longest = "";
    	for(String word : arr) {
    		if(word.length() > longest.length()) {
    			longest = word;
    		}
    	}
    	return longest;
    }
    public static boolean containsSOS(List<String> eggs) {
    	if(eggs.indexOf("... --- ...") == -1) {
    		return false;
    	}
    	return true;
        
    }
    public static List<Double> sortScores(List<Double> arr){
    	for(int i = 0; i < arr.size(); i++) {
    		for(int j = 0; j < arr.size(); j++) {
    			if(arr.get(j) > arr.get(i)) {
    				Double placeholder = arr.get(j);
    				arr.set(j, arr.get(i));
    				arr.set(i, placeholder);
    			}
    		}
    	}
    	return arr;
    }
    public static List<String> sortDNA(List<String> arr){
    	for(int i = 0; i < arr.size(); i++) {
    		for(int j = 0; j < arr.size(); j++) {
    			if(arr.get(j).length() > arr.get(i).length()) {
    				String placeholder = arr.get(j);
    				arr.set(j, arr.get(i));
    				arr.set(i, placeholder);
    			}
    		}
    	}
    	return arr;
    }
    public static List<String> sortWords(List<String> arr){
    	for(int i = 0; i < arr.size(); i++) {
    		for(int j = 0; j < arr.size() - 1; j++) {
    			if(arr.get(j).equals(arr.get(j + 1))) {
    				String placeholder = arr.get(j);
    				arr.set(j, arr.get(j + 1));
    				arr.set(j + 1, placeholder);
    			}
    		}
    	}
    	return arr;
    }
}
