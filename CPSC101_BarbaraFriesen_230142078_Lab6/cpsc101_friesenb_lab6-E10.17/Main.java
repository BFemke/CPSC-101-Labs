/**
* This file is part of a solution to
*     CPSC 101 Lab 6-Question E10.17 Winter 2020
*
*	Creates a frame with a button that has a counter
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main
{

	private static int numClick = 0;

	public static void main(String[] args)
	{

		//Creates Graphical display
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!");
		JPanel panel = new JPanel();
		panel.add(button);
		frame.add(panel);

		//initiates action listener
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				upClickCount();
				//Updates button message with click count
				button.setText("I have been clicked "+numClick+" times!");
			}
		});

		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//Increases click count
	public static void upClickCount()
	{
		numClick++;
	}
}