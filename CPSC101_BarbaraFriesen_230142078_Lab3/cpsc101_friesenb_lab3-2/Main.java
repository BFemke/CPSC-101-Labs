/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Creates a frame, printing NameComponent
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
		frame.setSize(300, 400);
		frame.setTitle("Red Name");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		NameComponent component = new NameComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}