/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Creates a frame with printing TwoSquareComponent
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;

public class Main
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Two Squares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TwoSquareComponent component = new TwoSquareComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}