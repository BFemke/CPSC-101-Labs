/**
* This file is part of a solution to
*     CPSC 101 Lab 6 - Question P10.26 Winter 2020
*
*	Creates mouse listener and specifies mouse event actions
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.lang.Math;

public class CircleFrame extends JFrame
{
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double radius;
	private int numClick = 0;
	private CircleComponent circle;

	class MousePressListener implements MouseListener
	{
		//Specifies actions to take following mouse event
		public void mousePressed(MouseEvent e)
		{
			//Gathers center coordinate information
			if(numClick == 0)
			{
				repaint();
				x1 = e.getX();
				y1 = e.getY();
				circle.makedot(x1, y1, x1, y1);
			}

			//Calculates radius making circle
			if(numClick == 1)
			{
				repaint();
				x2 = e.getX();
				y2 = e.getY();
				radius = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
				circle.makeCircle(x1, y1, radius);
				numClick = -1;
			}
			numClick++;
		}

		//Overwrites other mouse events
		public void mouseReleased(MouseEvent e){}
		public void mouseClicked(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
	}

	//Creates a frame that listens to mouse input
	public CircleFrame()
	{
		circle = new CircleComponent();
		add(circle);

		MouseListener listener = new MousePressListener();
		addMouseListener(listener);

		setSize(300, 400);
	}
}