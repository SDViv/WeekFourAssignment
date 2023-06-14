import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.NumberUpSupported;

public class WeekFourAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Coding Steps — Arrays and Methods
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int[] ages = { 3, 9, 23, 64, 2, 8, 28 };

		// Instructions are to get the difference of the first and last element.
		// However we are not allowed to use any numbers at all...
		int lengthOfArr = ages.length;
		int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);

		System.out.println("Difference of first and last element in ages[] = " + difference);

		int[] newAges = new int[ages.length];

		System.arraycopy(ages, 0, newAges, 0, ages.length);

		lengthOfArr = newAges.length;
		newAges[lengthOfArr - 1] = 100;
		difference = Math.abs(newAges[lengthOfArr - lengthOfArr] - newAges[lengthOfArr - 1]);

		System.out.println("Difference of first and last element in newAges[] = " + difference);

		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("The average age in newAges[] = " + average);

//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		String[] name = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sumOfLetters = 0;
		// for (String named: name) {
		for (int i = 0; i < name.length; i++) {
			sumOfLetters += name[i].length();
		}
		System.out.println(sumOfLetters / name.length);

//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		String concatenatedNames = "";
		String[] name3 = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		for (int j = 0; j < name3.length; j++) {
			concatenatedNames += name3[j] + " ";
		}
		System.out.println(concatenatedNames);

		// 3. How do you access the last element of any array?
//You always use the .length-1. For example, 
//System.out.println(name.length-1);

//		4.	How do you access the first element of any array?
// The first element is always [0], because arrays start at zero. 

//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
//and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[name3.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = name3[i].length();
		}

//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
//Print the result to the console.
		int sum2 = 0;
		for (int number : nameLengths) {
			sum2 += number;
		}
		System.out.println(sum2);

		// keep all methods below this curly bracket

//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		// to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the
		// method to return “HelloHelloHello”).
		String tripleHello = multiplyString("Hello", 3);
		System.out.println(tripleHello);

//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should 
		// be the first and the last name as a String separated by a space).
		System.out.println(fullName("Tom", "Smith"));

//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println(number(ages));

//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numbers3 = { 3, 9, 23, 64, 2, 8, 28 };
		System.out.println(banana(numbers3));

//11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		double[] dollars = { 100.00, 10.00, 15.00 };
		double[] moreDollars = { 100.00, 2.00, 12.00 };
		System.out.println(averageTrue(dollars, moreDollars));

//12.Write a method called willBuyDrink that takes a boolean isHotOutside, 
//and a double moneyInPocket, and returns true if it is hot outside and if 
//moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 11.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

//13.	Create a method of your own that solves a problem. In comments, 
//write what the method does and why you created it.
		boolean haveTimeOff = true;
		double moneyInBank = 4000.00;
		System.out.println(goOnCruise(haveTimeOff, moneyInBank));
	}

//enter method calls here:
//7.
	public static String multiplyString(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

//8.
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

//9.
	public static boolean number(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

//10.//method
	public static int banana(double[] numbers) {
		int number = 0;
		for (int i = 0; i < numbers.length; i++) {
			number += numbers[i];
		}
		return number / numbers.length;
	}

//11.
	public static boolean averageTrue(double[] dollars, double[] moreDollars) {
		int number = 0;
		for (int i = 0; i < dollars.length; i++)
			number += dollars[i];
		double averageDollars = number / dollars.length;
		int number2 = 0;
		{
			for (int j = 0; j < moreDollars.length; j++)
				number2 += moreDollars[j];
		}
		double averageMoreDollars = number2 / moreDollars.length;
		if (averageDollars > averageMoreDollars) {
			return true;
		} else {
			return false;
		}
	}

//12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}

//13. 
	private static boolean goOnCruise(boolean haveTimeOff, double moneyInBank) {
		if (haveTimeOff == true && moneyInBank > 5000.00) {
			return true;
		} else {
			return false;
		}
	}
}
