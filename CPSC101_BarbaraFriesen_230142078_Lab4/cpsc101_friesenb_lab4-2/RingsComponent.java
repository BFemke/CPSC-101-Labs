/**
* This file is part of a solution to
*     CPSC 101 Lab 4-2 Winter 2020
*
*	Draws components to build olympic rings
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RingsComponent extends JComponent
{
	public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;

			//draws blue ring
			Rings blueRing = new Rings(Color.BLUE, 55, 55);
			blueRing.draw(g2);

			//draws black ring
			Rings blackRing = new Rings(Color.BLACK, 145, 55);
			blackRing.draw(g2);

			//draws red ring
			Rings redRing = new Rings(Color.RED, 235, 55);
			redRing.draw(g2);

			//draws yellow ring
			Rings yellowRing = new Rings(Color.YELLOW, 100, 95);
			yellowRing.draw(g2);

			//draws green ring
			Rings greenRing = new Rings(Color.GREEN, 190, 95);
			greenRing.draw(g2);

		}

}