/**
* This file is part of a solution to
*     CPSC 101 Lab 2 Winter 2020
*
*	Converts numerical numbers into words and gives the
*		number of w's between 1-35000000.
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/

public class NumberToWord
{
	private static String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	private static String[] unit = {"thousand", "million", "billion"};
	public static void main(String[] args)
	{
		testMethod();

		int wCount = numberOfW();
		String wCountStr = numberToString(wCount);

		System.out.println("There are " + wCount + " w's in the range [1, 35000000].");

	}//main method

	/**
		* PURPOSE: Tests the numberToString method.
		*
		*@param 	None
		*@return	None
	*/
	public static void testMethod()
	{
		int num = 1567908627;
		String numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

		num = 90518001;
		numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

		num = 10021;
		numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

		num = 0;
		numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

		num = -37651;
		numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

		num = 7000010;
		numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

		num = 1;
		numWord = numberToString(num);
		System.out.println(num + " is " + numWord);

	}//testMethod

	/**
		* PURPOSE: Converts numerical number to words
		*
		*@param 	int num - number to convert to words
		*@return	String numWord - Word form of given number
	*/
	public static String numberToString(int num)
	{
		String numWord ="";
		int remainNum = 0;
		int unitMeasure = 0;
		String numberWord = "";

		if( num <= 0 || num >= 2000000000)
			return "out of bounds";

		while (num > 0 && num < 2000000000)
		{
			remainNum = num % 1000;  //breaks number into reasonable chunks
			num = num / 1000;

			if(remainNum > 0)
				numberWord = remainNumToWord(remainNum);

			//if-else combination checks if unit of measurement is needed
			if(unitMeasure > 0 && remainNum != 0)
			{
				numberWord = numberWord + unit[unitMeasure-1] + " ";
				numWord = numberWord + numWord;
			}
			else if(unitMeasure >= 0 && remainNum != 0)
				numWord = numberWord + numWord;
			unitMeasure++; //count number of times loop executes

		}//while loop

		return numWord;
	}//remainToNum method

	/**
		* PURPOSE: Converts number by unit of measurement
		*
		*@param 	int remainNum - Given unit of measurment; max 3 digits
		*@return	String numberWord - given in 3 digit increments
	*/
	private static String remainNumToWord(int remainNum)
	{
		String remainNumStr = Integer.toString(remainNum);
		String strIndex[] = remainNumStr.split("");
		String numberWord = "";

		for(int i = 0; i < remainNumStr.length();i++)
		{
			//turns corresponding digit back into an integer to serve as an index
			int index = Integer.parseInt(strIndex[i]);

			//checks if there is a zero in which case a word is not needed
			if(index != 0)
			{
				//taks care of the special cases of the number being between 10-19
				if((index == 1 && i == 1 && remainNumStr.length() == 3) || (index == 1 && i == 0 && remainNumStr.length() == 2))
				{
					index = 10 + Integer.parseInt(strIndex[i+1]);
					numberWord = numberWord + ones[index] + " ";
					i++;
				}

				//Adds "-" if needed otherwise " " for tenths
				else if((index != 1 && i == 1 && remainNumStr.length() == 3) || (index != 1 && i == 0 && remainNumStr.length() == 2))
				{
					numberWord = numberWord + tens[index-2];
					if(remainNumStr.charAt(i+1) != '0')
						numberWord = numberWord + "-";
					else
						numberWord = numberWord + " ";
				}

				//adds "hundred" to the string if there is a hundredth digit
				else if(i == 0 && remainNumStr.length() == 3)
				{
					numberWord = numberWord + ones[index] + " hundred ";
				}

				//executes if digit is singular, not impacted by other digits
				else
				{
					numberWord = numberWord + ones[index] + " ";
				}
			}
		}
		return numberWord;
	}//remainNumToWord

	/**
			* PURPOSE: Counts w's counting between 1-35000000
			*
			*@param 	none
			*@return	int wCount - number of counted w's
	*/
	public static int numberOfW()
	{
		int wCount = 0;

		//loops through numbers 1-35000000
		for(int i = 1; i <= 35000000; i++)
		{
			String numWord = numberToString(i);

			//loops through every letter of a number counting w's
			for(int j = 0; j < numWord.length(); j++)
			{
				char ch = numWord.charAt(j);
				if(ch == 'w')
					wCount++;
			}//letter loop

		}//number loop

		return wCount;
	}//numberOfW method

}//class