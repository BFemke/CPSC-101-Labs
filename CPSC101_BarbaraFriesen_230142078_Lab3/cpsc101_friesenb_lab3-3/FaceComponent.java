/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Draws components making a face
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FaceComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		//draws head
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double face = new Ellipse2D.Double(100, 125, 300, 350);
		g2.draw(face);

		//draws the eyes
		Ellipse2D.Double eye1 = new Ellipse2D.Double(150, 220, 70, 70);
		g2.setColor(Color.CYAN);
		g2.fill(eye1);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(280, 220, 70, 70);
		g2.fill(eye2);

		//draws pupils
		g2.setColor(Color.DARK_GRAY);
		Ellipse2D.Double pupil1 = new Ellipse2D.Double(170, 240, 30, 30);
		g2.fill(pupil1);
		Ellipse2D.Double pupil2 = new Ellipse2D.Double(300, 240, 30, 30);
		g2.fill(pupil2);

		//Draws mouth
		g2.setColor(Color.RED);
		Line2D.Double smilePart1 = new Line2D.Double(150, 350, 200, 390);
		g2.draw(smilePart1);
		Line2D.Double smilePart2 = new Line2D.Double(200, 390, 250, 410);
		g2.draw(smilePart2);
		Line2D.Double smilePart3 = new Line2D.Double(250, 410, 300, 390);
		g2.draw(smilePart3);
		Line2D.Double smilePart4 = new Line2D.Double(300, 390, 350, 350);
		g2.draw(smilePart4);


	}
}