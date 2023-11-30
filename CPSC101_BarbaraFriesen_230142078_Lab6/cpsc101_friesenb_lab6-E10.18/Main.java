/**
* This file is part of a solution to
*     CPSC 101 Lab 6-Question E10.17 Winter 2020
*
*	Creates two buttons with counters
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
	static int b1Click = 0;
	static int b2Click = 0;
	public static void main(String[] args)
	{

		//Creates Graphical display
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Click Me!");
		JButton button2 = new JButton("Click Me!");
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("I have been clicked "+b1Click+" times!");
		JLabel label2 = new JLabel("I have been clicked "+b2Click+" times!");
		panel.add(button1);
		panel.add(label1);
		panel.add(button2);
		panel.add(label2);

		frame.add(panel);

		//initiates action listener for first button
		button1.addActionListener(new ActionListener()
		{
			//Updates label to indicate number of button 1 clicks
			public void actionPerformed(ActionEvent e)
			{
				upClickCount1();
				label1.setText("I have been clicked "+b1Click+" times!");
			}
		});

		//Initializes action listener for second button
		button2.addActionListener(new ActionListener()
		{
			//Updates label to indicate number of button 2 clicks
			public void actionPerformed(ActionEvent e)
			{
				upClickCount2();
				label2.setText("I have been clicked "+b2Click+" times!");
			}
		});

		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//Increases click count for first button
	public static void upClickCount1()
	{
		b1Click++;
	}

	//Increases click count for second button
	public static void upClickCount2()
	{
		b2Click++;
	}
}