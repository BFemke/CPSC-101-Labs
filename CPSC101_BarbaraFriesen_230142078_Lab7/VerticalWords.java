/**
* This file is part of a solution to
*     CPSC 101 Lab 7 Winter 2020
*
*	Creates ArrayList of vertical words from input
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;

public class VerticalWords
{
	private ArrayList<String> verticalWords = new ArrayList<String>();
	private char[][] crossWords;
	private int gridHeight;
	private int gridWidth;

	public VerticalWords(char[][] crossWords, int gridHeight, int gridWidth)
	{
		this.crossWords = crossWords;
		this.gridHeight = gridHeight;
		this.gridWidth = gridWidth;
	}

	/**
	* PURPOSE:	Creates an arraylist with every vertical word
	*
	* @param	none
	*
	* @return	none
	*/
	public void createVerticalWords()
	{
		int columns = 0;

		while(columns < gridWidth)
		{

			int i = 0;
			String columnChars = "";
			while(i < gridHeight)
			{
				columnChars = columnChars + crossWords[i][columns];
				i++;
			}
			String[] splitWords = columnChars.split("X");

			for(String word: splitWords)
			{
				if(word.length() > 1)
				{
					verticalWords.add(word);
				}
			}
			columns++;
		}
	}

	/**
	* PURPOSE:	Is a getter for word in ArrayList
	*
	* @param	int index - the index number of word desired
	*
	* @return	String - The vertical word at the given index
	*/
	public String getVerticalWord(int index)
	{
		return verticalWords.get(index);
	}

	/**
	* PURPOSE:	Is a getter for how many vertical words there are
	*
	* @param	int - Number of vertical words
	*
	* @return	none
	*/
	public int getArrayLength()
	{
		return verticalWords.size();
	}
}