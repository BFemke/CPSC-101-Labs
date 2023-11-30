/**
* This file is part of a solution to
*     CPSC 101 Lab 7 Winter 2020
*
*	Creates anf combines the graphic components
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;

public class CrossWordViewer extends JFrame
{
	private String word;
	private int row = 0;
	private int numVertical = 0;
	private int numHorizontal = 0;
	char[][] crossWords;
	private int gridHeight;
	private int gridWidth;

	public CrossWordViewer(char[][] words, int height, int width)
	{
		crossWords = new char[height][width];
		letterBox = new JPanel[height][width];
		crossWords = words;
		gridHeight = height;
		gridWidth = width;
		displayGUI();
	}

	/**
	* PURPOSE:	Displays the crossword and word list
	*
	* @param	none
	*
	* @return	none
	*/
	private void displayGUI()
	{
		JPanel wordList = new JPanel();
		wordList.setBackground(Color.WHITE);
		wordList.setLayout(new GridLayout(1, 2, 20, 0));
		JPanel vertical = new JPanel();
		vertical.setBackground(Color.WHITE);
		JPanel horizontal = new JPanel();
		horizontal.setBackground(Color.WHITE);

		//Calls method to create vertical words
		VerticalWords vWords = new VerticalWords(crossWords, gridHeight, gridWidth);
		vWords.createVerticalWords();
		numVertical = vWords.getArrayLength();

		//creates text area with vertical words
		vertical.setLayout(new GridLayout(numVertical+1, 1));
		int numWords = 1;
		vertical.add(new JTextArea("Vertical:"));
		for(int i = 0; i < numVertical; i++)
		{
			vertical.add(new JTextArea(numWords + ". " + vWords.getVerticalWord(i)));
			numWords++;
		}

		//Calls method to create horizontal words
		HorizontalWords hWords = new HorizontalWords(crossWords, gridHeight, gridWidth);
		hWords.createHorizontalWords();
		numHorizontal = hWords.getArrayLength();

		//Creates text with horizontal words
		horizontal.setLayout(new GridLayout(numHorizontal+1, 1));
		horizontal.add(new JTextArea("Horizontal:"));
		numWords = 1;
		for(int i = 0; i < numHorizontal; i++)
		{
			horizontal.add(new JTextArea(numWords + ". " + hWords.getHorizontalWord(i)));
			numWords++;
		}


		JPanel crossWordPanel = new JPanel();
		crossWordPanel.setLayout(new GridLayout(gridHeight, gridWidth));
		int numBox = 0;
		BorderLayout layout = new BorderLayout();

		//Adds letter or black box to grid panel in the form of a crossword
		for(int i = 0; i < gridHeight; i++)
		{
			for(int j = 0; j < gridWidth; j++)
			{
				JPanel letter = new JPanel();
				String letterStr = "" + crossWords[i][j];
				numBox++;
				if(crossWords[i][j] == ('X'))
				{
					letter.setBackground(Color.BLACK);
				}
				else
				{
					JTextArea area = new JTextArea();
					area.setText(letterStr);
					letter.setBackground(Color.WHITE);
					letter.add((new JTextArea(letterStr)), BorderLayout.CENTER);
				}
				crossWordPanel.add(letter);
			}
		}
		wordList.add(vertical);
		wordList.add(horizontal);

		//Creates and prints out frame with components
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Crossword");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(crossWordPanel, BorderLayout.CENTER);
		frame.add(wordList, BorderLayout.EAST);
		frame.setVisible(true);
	}


}