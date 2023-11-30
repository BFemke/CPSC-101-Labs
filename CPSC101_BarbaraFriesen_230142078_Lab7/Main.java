/**
* This file is part of a solution to
*     CPSC 101 Lab 7 Winter 2020
*
*	Takes in input to create crossword
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main
{
	private static ArrayList<String> horizontalWords = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scanIn = new Scanner(System.in);
		final int numArgs = args.length;
		//Allows for input text to be given as an argument
		if(numArgs < 1)
		{
			scanIn = new Scanner(new FileReader(args[1]));
		}
		//Turns the crossword dimension values into numbers
		int gridHeight  = Integer.parseInt(scanIn.nextLine());
		int gridWidth = Integer.parseInt(scanIn.nextLine());

		char[][] crossWords = new char[gridHeight][gridWidth];


		int row = 0;
		String word;

		//Creates a 2D array representing the crossword
		while(scanIn.hasNext())
		{
			word = scanIn.nextLine();
			for(int i = 0; i < word.length(); i++)
			{
				crossWords[row][i] = word.charAt(i);
			}
			row++;
		}
		CrossWordViewer viewer = new CrossWordViewer(crossWords, gridHeight, gridWidth);
	}

}