package src;

import java.util.Scanner;

public class W3HomeWork {

	public static void main(String[] args) {

//		Coding Steps — Arrays and Methods
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};

//		a. Programmatically subtract the value of the first element in the array from the value in the last element of
//		the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		int subtract = ages[ages.length-1]-ages[0];
		System.out.println(subtract);
		
//		b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different
//		lengths).
		//done.
		
//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum =0; 
		for (int i = 0 ; i < ages.length; i++) {
			sum = ages[i] + sum;
		}
		double ave = sum / ages.length;
		System.out.println(ave);
		
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”,
//		“Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result
//		to the console.
		double sumOfLetters = 0; 
		for (String name : names) {
			sumOfLetters += name.length();
		}
		double averageOfLetters = sumOfLetters / names.length;
		
		System.out.println(averageOfLetters);
		
//		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces,
//		and print the result to the console.
		
		String together = "";
		for (String name : names) {
			together += name + " ";
		}
			System.out.println(together);
				
//			3. How do you access the last element of any array?
			// using method ".length" eg. arry[arry.length-1];
//			4. How do you access the first element of any array?
			// can called by "array[0]" 
	
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and
//		add the length of each name to the nameLengths array.	
			int[] nameLengths = new int[names.length];
			for (int j = 0; j < names.length; j++) {
				nameLengths [j] = names[j].length();
			}
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the
//		result to the console.
			
			int sumsum = 0;
			for (int length : nameLengths) {
				sumsum += length;
			}
			System.out.println(sumsum);

//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n
//		number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	


		System.out.println(repeatWord("Yeonga", 13));
	
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the
//		first and the last name as a String separated by a space).
		System.out.println(fullName("Yeonga", "Oh"));
		
//		9. Write a method that takes an array of int and returns true if the sum of all the int in the array is greater than 100.
		System.out.println(greater(ages));

//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));

//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is
//		greater than the average of the elements in the second array	
		double[] doubles1 = {45.7, 30.2, 67.3};
		double[] doubles2 = {50.1, 55.2, 80.3};
		System.out.println(comparingAverage(doubles1, doubles2));
		
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns
//		true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println(willBuyDrink(true, 13.00));
		
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created
//		it.
	
		
	}
	
	public static String repeatWord(String userWord, int numTimes) {
			
        String result = "";
	    for (int i = 1; i <= numTimes; i++) {
	        result = result + userWord ;
	        }
		return result;
	}		
	
	public static String fullName(String firstName, String lastName) {
		
        String full = firstName + " " + lastName;
	    
		return full;		
	}

	public static boolean greater (int[] array) {
		int sumsumsum = 0;
		for (int arr : array) {
			sumsumsum += arr;
			}
	return sumsumsum > 100;
		}
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	public static boolean comparingAverage(double[] array, double[] array1) {
		
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		double ave = sum / array.length;
		
		double sum1 = 0;
		for (double number : array1) {
			sum1 += number;
		}
		double ave1 = sum1 / array1.length;
		
		return ave > ave1;
	}
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true &&	moneyInPocket > 10.50) {
			return true;
		} else {
			return false;			
		}		
	}

	
	
}
	
	

	


