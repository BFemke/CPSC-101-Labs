/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Builds a frame and prints FaceComponent
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
		frame.setTitle("Smiley Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FaceComponent component = new FaceComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}