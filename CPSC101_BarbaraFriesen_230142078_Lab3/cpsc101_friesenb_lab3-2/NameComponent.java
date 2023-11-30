/**
* This file is part of a solution to
*     CPSC 101 Lab 3 Winter 2020
*
*	Creates a component of "Barbara Z Friesen"
*		in red
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.drawString("Barbara Z Friesen", 85, 100);
	}
}