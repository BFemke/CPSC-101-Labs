/**
* This file is part of a solution to
*     CPSC 101 Lab 5 Winter 2020
*
*		Creates list of given words with a specified number
*			of non-increasing consonants
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/

import java.io.*;

import java.util.Scanner;
import java.util.Arrays;

public class Warriorhood
{

	public static void main(String[] args) throws FileNotFoundException
	{
		String word = "";
		String wordConsonants = "";
		char[] consonants = {'b','B','c','C','d','D','f','F','g','G','h',
		'H','j','J','k','K','l','L','m','M','n','N','p','P','q','Q','r','R','s','S','t','T','v',
		'V','w','W','x','X','z','Z'};
		PrintWriter myOut = new PrintWriter(System.out);
		Scanner scanIn = new Scanner(System.in);

		int numConsonants = 6;
		final int numArgs = args.length;

		//Changes printwriter if parameter given
		if(numArgs > 2)
		{
			myOut = new PrintWriter(new File(args[2]));
		}

		//Changes fileReader if parameter given
		if(numArgs > 1)
		{
			scanIn = new Scanner(new FileReader(args[1]));
		}

		//Changes number of required consonants if parameter given
		if(numArgs > 0)
		{
			numConsonants = Integer.parseInt(args[0]);
		}

		//Loops until there is not more words
		while(scanIn.hasNext())
		{
			word = scanIn.nextLine();
			wordConsonants = word.replaceAll("[aeiouyæäöøAEIOUYÄÖ]", ""); //removes the vowels

			//calls method to check if word meets requirements
			boolean legal = checkLegal(wordConsonants, numConsonants, consonants);

			//Prints our word if requirements were met
			if(legal)
			{
				myOut.println(word);
			}
		}
		myOut.close();
	}

	private static boolean checkLegal(String wordConsonants, int numConsonants, char[] consonants)
	{
		int inRow = 0;
		int currentCons = 0;
		int prevCons = 0;

		//Tests to see if there are the required amount of consonants
		if(wordConsonants.length()<numConsonants)
		{
			return false;
		}

		//Checks if each successive consonant is non-increasing
		while(inRow < numConsonants)
		{
			for(int i = 0; i < wordConsonants.length(); i++)
			{
				for(int j = 0;j < consonants.length; j++)
				{
					if(wordConsonants.charAt(i) == consonants[j])
					{
						currentCons = j;
					}
				}
				if(currentCons > prevCons && i != 0)
				{
					return false;
				}

				prevCons = currentCons;
				inRow++;
			}
		}
		return true;
	}
}