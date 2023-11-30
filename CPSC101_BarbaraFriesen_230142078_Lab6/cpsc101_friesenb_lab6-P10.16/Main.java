/**
* This file is part of a solution to
*     CPSC 101 Lab 6 - Question P10.16 Winter 2020
*
*	Sets frame and makes it visible
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args)
	{
		JFrame frame = new TriangleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}