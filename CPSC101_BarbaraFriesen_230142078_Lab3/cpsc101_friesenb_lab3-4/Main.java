/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Builds frame and prints TrafficLightComponent
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
		frame.setTitle("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TrafficLightComponent component = new TrafficLightComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}