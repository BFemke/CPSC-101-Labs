/**
* This file is part of a solution to
*     CPSC 101 Lab 6-Question E10.19 Winter 2020
*
*	Indicates which of two labeled buttons you press
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
**/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main
{
	private static JButton buttonA;
	private static JButton buttonB;

	public static void main(String[] args)
	{

		//Creates Graphical display
		JFrame frame = new JFrame();
		buttonA = new JButton("A");
		buttonB = new JButton("B");
		JPanel panel = new JPanel();
		panel.add(buttonA);
		panel.add(buttonB);

		frame.add(panel);

		//initiates action listener for first button
		buttonA.addActionListener(actions);

		//Initializes action listener for second button
		buttonB.addActionListener(actions);

		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//Takes care of the action for both button presses
	private static ActionListener actions = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			//Checks if Button A was pressed
			if(e.getSource() == buttonA)
			{
				JOptionPane.showMessageDialog(null, "You pressed button A!");
			}

			//Checks if button B was pressed
			else if(e.getSource() == buttonB)
			{
				JOptionPane.showMessageDialog(null, "You pressed button B!");
			}
		}
	};
}