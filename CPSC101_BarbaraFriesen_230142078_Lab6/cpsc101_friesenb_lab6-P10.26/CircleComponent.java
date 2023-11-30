/**
* This file is part of a solution to
*     CPSC 101 Lab 6 - Question P10.26 Winter 2020
*
*	Creates the graphical component of the circle
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{
	private Ellipse2D.Double circle;
	private Line2D.Double dot;

	//draws center dot
	public void makedot(double x1, double y1, double x2, double y2)
		{
			dot = new Line2D.Double(x1, y1, x2, y2);
			circle = new Ellipse2D.Double();

	}

	//Creates circle component
	public void makeCircle(double centerX, double centerY, double radius)
	{
		double x = centerX-radius;
		double y = centerY-radius;
		circle = new Ellipse2D.Double(x, y, radius*2, radius*2);

	}


	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		//draws circle
		g2.draw(dot);
		g2.draw(circle);
	}

}