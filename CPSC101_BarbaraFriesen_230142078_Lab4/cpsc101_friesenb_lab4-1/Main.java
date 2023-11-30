/**
* This file is part of a solution to
*     CPSC 101 Lab 4-1 Winter 2020
*
*	Builds frame and calls HouseComponent
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
		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setTitle("Neighborhood");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		HouseComponent component = new HouseComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}