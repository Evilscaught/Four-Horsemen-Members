/*Author(s): 		Jack Cummings, Scott McKay
 *Name of Group:	The Four Horsemen
 *Date Created: 	Wednesday, September 11th, 2017
 *Class:			Software Science [CSCI 323-01]
 *Purpose of Class:	Main panel in window (frame)
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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
		private JButton closePgrm    = new JButton("Exit");
	
		public Panel()
		{
			ImageIcon horsemen = new ImageIcon("images/four_horsemen.jpg");
			
			JLabel groupName = new JLabel("THE FOUR HORSEMEN", SwingConstants.CENTER); 
			JLabel backgroundImage = new JLabel(horsemen); 


			groupName.setPreferredSize(new Dimension(300, 75));
			groupName.setForeground(Color.WHITE);
			
			backgroundImage.setLayout(new BorderLayout());
			
			profileJack.addActionListener( new ButtonListener());
			profileScott.addActionListener(new ButtonListener());
			closePgrm.addActionListener(new ButtonListener());

			setBackground(Color.DARK_GRAY);
			
			add(backgroundImage);
			add(groupName, BorderLayout.CENTER); 
			add(profileJack, BorderLayout.SOUTH);
			add(profileScott, BorderLayout.SOUTH);
			add(closePgrm);
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
				if (source.getSource() == closePgrm)
				{
					System.exit(0);
				}
			}
		}
}