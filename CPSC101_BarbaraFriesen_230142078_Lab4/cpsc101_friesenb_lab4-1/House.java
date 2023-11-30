/**
* This file is part of a solution to
*     CPSC 101 Lab 4-1 Winter 2020
*
*	Builds a house with adjustable scale
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class House extends JComponent
{
	private double xLeft;
	private double yTop;
	private double scale;

	//creates a house object with set coordinates and scale
	public House(double x, double y, double scalePercent)
	{
		xLeft = x;
		yTop = y;
		scale = scalePercent / 100;
	}

	//draws components to make a house
	public void draw(Graphics2D g2)
	{

		//makes house frame
		Rectangle2D.Double houseFrame = new Rectangle2D.Double(xLeft, yTop+60*scale, 180*scale, 200*scale);
		g2.draw(houseFrame);

		//makes Roof
		Line2D.Double roof1 = new Line2D.Double(xLeft+70*scale, yTop, xLeft, yTop+60*scale);
		g2.draw(roof1);
		Line2D.Double roof2 = new Line2D.Double(xLeft+180*scale, yTop+60*scale, xLeft+70*scale, yTop);
		g2.draw(roof2);

		//Makes windows
		Rectangle2D.Double window1 = new Rectangle2D.Double(xLeft+30*scale, yTop+100*scale, 40*scale, 40*scale);
		g2.draw(window1);
		Line2D.Double window1Line1 = new Line2D.Double(xLeft+70*scale, yTop+120*scale, xLeft+30*scale, yTop+120*scale);
		g2.draw(window1Line1);
		Line2D.Double window1Line2 = new Line2D.Double(xLeft+50*scale, yTop+140*scale, xLeft+50*scale, yTop+100*scale);
		g2.draw(window1Line2);
		Rectangle2D.Double window2 = new Rectangle2D.Double(xLeft+110*scale, yTop+100*scale, 40*scale, 40*scale);
		g2.draw(window2);
		Line2D.Double window2Line1 = new Line2D.Double(xLeft+150*scale, yTop+120*scale, xLeft+110*scale, yTop+120*scale);
		g2.draw(window2Line1);
		Line2D.Double window2Line2 = new Line2D.Double(xLeft+130*scale, yTop+140*scale, xLeft+130*scale, yTop+100*scale);
		g2.draw(window2Line2);

		//Makes front entrance
		Rectangle2D.Double door = new Rectangle2D.Double(xLeft+70*scale, yTop+190*scale, 40*scale, 60*scale);
		g2.draw(door);
		Ellipse2D.Double doorWindow = new Ellipse2D.Double(xLeft+80*scale, yTop+200*scale, 20*scale, 10*scale);
		g2.draw(doorWindow);
		Ellipse2D.Double doorKnob = new Ellipse2D.Double(xLeft+100*scale, yTop+217*scale, 5*scale, 5*scale);
		g2.draw(doorKnob);
		Rectangle2D.Double doorStep = new Rectangle2D.Double(xLeft+60*scale, yTop+250*scale, 60*scale, 10*scale);
		g2.draw(doorStep);

		//Makes chimney
		Line2D.Double chimneyTop = new Line2D.Double(xLeft+150*scale, yTop+10*scale, xLeft+130*scale, yTop+10*scale);
		g2.draw(chimneyTop);
		Line2D.Double chimneyLeft = new Line2D.Double(xLeft+130*scale, yTop+32.73*scale, xLeft+130*scale, yTop+10*scale);
		g2.draw(chimneyLeft);
		Line2D.Double chimneyRight = new Line2D.Double(xLeft+150*scale, yTop+10*scale, xLeft+150*scale, yTop+43.64*scale);
		g2.draw(chimneyRight);
	}
}