/**
* This file is part of a solution to
*     CPSC 101 Lab 7 Winter 2020
*
*	Creates a list of horizontal words
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;

public class HorizontalWords
{
	private ArrayList<String> horizontalWords = new ArrayList<String>();
	private char[][] crossWords;
	private int gridHeight;
	private int gridWidth;

	public HorizontalWords(char[][] crossWords, int gridHeight, int gridWidth)
	{
		this.crossWords = crossWords;
		this.gridHeight = gridHeight;
		this.gridWidth = gridWidth;
	}

	/**
	* PURPOSE:	Creates a list of all the horizontal words
	*
	* @param	none
	*
	* @return	none
	*/
	public void createHorizontalWords()
	{
		int rows = 0;

		while(rows < gridHeight)
		{

			int i = 0;
			String rowChars = "";
			while(i < gridWidth)
			{
				rowChars = rowChars + crossWords[rows][i];
				i++;
			}
			String[] splitWords = rowChars.split("X");

			//Removes all black box representations
			for(String word: splitWords)
			{
				if(word.length() > 1)
				{
					horizontalWords.add(word);
				}
			}
			rows++;
		}
	}

	/**
	* PURPOSE:	Sends the desired horizontal word
	*
	* @param	int index - the index of the word to be retrieved
	*
	* @return	String - The desired word at the index number
	*/
	public String getHorizontalWord(int index)
	{
		return horizontalWords.get(index);
	}

	/**
	* PURPOSE:	Sends the number of horizontal words
	*
	* @param	none
	*
	* @return	int - number of horizontal words in list
	*/
	public int getArrayLength()
	{
		return horizontalWords.size();
	}
}