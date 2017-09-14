/*Author(s): 		Jack Cummings, Scott McKay
 *Name of Group:	The Four Horsemen
 *Date Created: 	Wednesday, September 13th, 2017 @9:40 p.m. MST
 *Class:			Software Science [CSCI 323-01]
 *Purpose of Class:	Main panel in window (frame)
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants; 

public class Panel extends JPanel
{
	private static final long serialVersionUID = 5509155261502497671L;

		public Panel()
		{
			JLabel textLabel = new JLabel("<<INSERT COMPANY NAME HERE>>",SwingConstants.CENTER); 
			JButton button = new JButton("Jack Cummings");
			
			textLabel.setPreferredSize(new Dimension(300, 100));
			
			button.addActionListener( new ButtonListener());

			add(textLabel, BorderLayout.CENTER); 
			add(button, BorderLayout.SOUTH);
		}

		private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent source) 
			{
				Jack.createWindow();
			}
		}
}