/*Author(s): 		Jack Cummings, Scott McKay, Dan Bailey
 *Name of Group:	The Four Horsemen
 *Date Created: 	Wednesday, September 11th, 2017
 *Class:			Software Science [CSCI 323-01]
 *Purpose of Class:	Main panel in window (frame)
 */

import java.awt.BorderLayout;
import java.awt.Color;
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

		//Global Attributes
		private JButton profileJack  = new JButton("Jack Cummings");
		private JButton profileScott = new JButton("Scott McKay");
		private JButton profileDan = new JButton("Dan Bailey");
		private JButton closePgrm    = new JButton("Exit");
	
		public Panel()
		{
			//Local Attributes
			JLabel groupName = new JLabel("THE FOUR HORSEMEN", SwingConstants.CENTER);
			
			//Title, group-name, and background image
			setBackground(Color.DARK_GRAY);
			add(new ImageLoad(1146, 675, "images/four_horsemen.jpg"));
			groupName.setPreferredSize(new Dimension(300, 75));
			groupName.setForeground(Color.WHITE);
			
			//Add Action Listeners to JButtons
			profileJack.addActionListener( new ButtonListener());
			profileScott.addActionListener(new ButtonListener());
			profileDan.addActionListener(new ButtonListener());
			closePgrm.addActionListener(new ButtonListener());

			//Add content to panel on main-frame.
			add(groupName, BorderLayout.CENTER);
			add(profileJack, BorderLayout.SOUTH);
			add(profileScott, BorderLayout.SOUTH);
			add(profileDan, BorderLayout.SOUTH);
			add(closePgrm);

		}

		//This class allows JButtons (added to Panel constructor above) to perform actions
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
				if (source.getSource()==profileDan)
				{
					DanProfile.createWindow();
				}
				if (source.getSource() == closePgrm)
				{
					System.exit(0);
				}
			}
		}
}
