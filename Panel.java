/*Author(s): 		Jack Cummings, Scott McKay
 *Name of Group:	The Four Horsemen
 *Date Created: 	Wednesday, September 11th, 2017
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
		//Not sure what this does, but it makes Eclipse shut-up. :)
		private static final long serialVersionUID = 5509155261502497671L;
		
		private JButton profileJack  = new JButton("Jack Cummings");
		private JButton profileScott = new JButton("Scott McKay");
	
		public Panel()
		{
			JLabel textLabel = new JLabel("The Four Horsemen",SwingConstants.CENTER); 
			
			textLabel.setPreferredSize(new Dimension(300, 100));
			
			profileJack.addActionListener( new ButtonListener());
			profileScott.addActionListener(new ButtonListener());

			add(textLabel, BorderLayout.CENTER); 
			add(profileJack, BorderLayout.SOUTH);
			add(profileScott, BorderLayout.SOUTH);
		}

		private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent source) 
			{
				if (source.getSource() == profileJack)
				{
					JackProfile.createWindow();
				}
				if (source.getSource() == profileScott)
				{
					ScottProfile.createWindow();
				}
			}
		}
}