/**
* This file is part of a solution to
*     CPSC 101 Lab 6 - Question P10.16 Winter 2020
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

public class TriangleFrame extends JFrame
{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int numClick = 0;
	private TriangleComponent triangle;

	class MousePressListener implements MouseListener
	{
		//Specifies actions to take following mouse event
		public void mousePressed(MouseEvent e)
		{
			//Creates initial dot
			if(numClick == 0)
			{
				repaint();
				x1 = e.getX();
				y1 = e.getY();
				triangle.makedot(x1, y1, x1, y1);
			}

			//Creates first line
			if(numClick == 1)
			{
				repaint();
				x2 = e.getX();
				y2 = e.getY();
				triangle.makeLine1(x1, y1, x2, y2);
			}

			//Finishes triangle resetting click count
			if(numClick == 2)
			{
				repaint();
				x3 = e.getX();
				y3 = e.getY();
				triangle.makeLine2(x2, y2, x3, y3);
				triangle.makeLine3(x3, y3, x1, y1);
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
	public TriangleFrame()
	{
		triangle = new TriangleComponent();
		add(triangle);

		MouseListener listener = new MousePressListener();
		addMouseListener(listener);

		setSize(300, 400);
	}
}