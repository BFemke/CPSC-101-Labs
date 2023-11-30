/**
* This file is part of a solution to
*     CPSC 101 Lab 6 - Question P10.16 Winter 2020
*
*	Creates the graphical component of the triangle
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

public class TriangleComponent extends JComponent
{
	private Line2D.Double dot;
	private Line2D.Double line1;
	private Line2D.Double line2;
	private Line2D.Double line3;

	//Starts new triangle with a single dot, overwriting previous triangle
	public void makedot(int x1, int y1, int x2, int y2)
	{
		dot = new Line2D.Double(x1, y1, x2, y2);
		line1 = new Line2D.Double();
		line2 = new Line2D.Double();
		line3 = new Line2D.Double();

	}

	//Creates first line
	public void makeLine1(int x1, int y1, int x2, int y2)
	{
		line1 = new Line2D.Double(x1, y1, x2, y2);

	}

	//Creates second line
	public void makeLine2(int x1, int y1, int x2, int y2)
	{
		line2 = new Line2D.Double(x1, y1, x2, y2);

	}

	//Creates third line
	public void makeLine3(int x1, int y1, int x2, int y2)
	{
		line3 = new Line2D.Double(x1, y1, x2, y2);

	}


	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		//draws components of triangle
		g2.draw(dot);
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
	}

}