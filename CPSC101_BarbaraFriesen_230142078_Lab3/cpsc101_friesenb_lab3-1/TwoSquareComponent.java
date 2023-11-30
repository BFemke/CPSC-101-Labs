/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Draws two different size squares with the same center.
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(10, 10, 200, 200);
		g2.draw(box);
		Rectangle box2 = new Rectangle(60, 60, 100, 100);
		g2.draw(box2);
	}
}