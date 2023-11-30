/**
* This file is part of a solution to
*     CPSC 101 Lab 4-2 Winter 2020
*
*	Builds frame and calls RingsComponent
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;

public class Main
{
	public static void main (String[] args)
	{
		//Builds Frame
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Olympic Rings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Displays the Olympic rings
		RingsComponent component = new RingsComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}