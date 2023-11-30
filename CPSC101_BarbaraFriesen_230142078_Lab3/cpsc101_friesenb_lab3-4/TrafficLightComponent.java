/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Draws components to build a traffic light
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TrafficLightComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		//draws traffic light box and stand
		g2.setColor(Color.DARK_GRAY);
		Rectangle box = new Rectangle(150, 50, 200, 500);
		g2.fill(box);
		Rectangle stand = new Rectangle(240, 550, 20, 50);
		g2.fill(stand);

		//draws green light
		g2.setColor(Color.GREEN);
		Ellipse2D.Double greenLight = new Ellipse2D.Double(200, 100, 100, 100);
		g2.fill(greenLight);

		//draws yellow light
		g2.setColor(Color.YELLOW);
		Ellipse2D.Double yelloLight = new Ellipse2D.Double(200, 250, 100, 100);
		g2.fill(yelloLight);

		//draws red light
		g2.setColor(Color.RED);
		Ellipse2D.Double redLight = new Ellipse2D.Double(200, 400, 100, 100);
		g2.fill(redLight);

	}
}