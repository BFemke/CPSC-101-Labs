/**
* This file is part of a solution to
*     CPSC 101 Lab 4-1 Winter 2020
*
*	Draws multiple houses to build a a neighborhood
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class HouseComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		//Draws first house
		House house1 = new House(15, getHeight()-300, 110);
		house1.draw(g2);

		//draws second house
		House house2 = new House(250, getHeight()-280, 50);
		house2.draw(g2);

		//draws third house
		House house3 = new House(350, getHeight()-280, 10);
		house3.draw(g2);

		//draws fourth house
		House house4 = new House(15, (getHeight()-500), 65);
		house4.draw(g2);

		//draws fifth house
		House house5 = new House(150, (getHeight()-500), 45);
		house5.draw(g2);

	}
}