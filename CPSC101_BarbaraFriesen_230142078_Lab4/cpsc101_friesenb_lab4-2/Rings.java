/**
* This file is part of a solution to
*     CPSC 101 Lab 4-2 Winter 2020
*
*	Creates coloured ring objects
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Rings extends JComponent
{
	private Color colour;
	private double centerX;
	private double centerY;

	//Creates ring object with preset coordinates and colour
	public Rings(Color colour, double centerX, double centerY)
	{
		this.colour = colour;
		this.centerX = centerX;
		this.centerY = centerY;
	}

	//draws a coloured ring
	public void draw(Graphics2D g2)
	{
		g2.setColor(colour);
		Shape ring = createRingShape(centerX, centerY, 45, 10); //calls on createRingShape
		g2.fill(ring);
	}

	//Creates a ring shape with a transparent hole
	private static Shape createRingShape(
	       double centerX, double centerY, double outerRadius, double thickness)
	{
		Ellipse2D outer = new Ellipse2D.Double(
	       centerX - outerRadius,
	       centerY - outerRadius,
	       outerRadius + outerRadius,
	       outerRadius + outerRadius);
		Ellipse2D inner = new Ellipse2D.Double(
	    	centerX - outerRadius + thickness,
			centerY - outerRadius + thickness,
	        outerRadius + outerRadius - thickness - thickness,
	        outerRadius + outerRadius - thickness - thickness);
	    Area area = new Area(outer);
	    area.subtract(new Area(inner));
	    return area;
    }
}