/*Author(s): 				Scott McKay
 *Contributing Author(s): 	Jack Cummings
 *Name of Group:			The Four Horsemen
 *Date Created: 			Wednesday, September 13th, 2017 @10:30 p.m. MST
 *Class:					Software Science [CSCI 323-01]
 *Purpose of Class:			Scott McKay's Profile
 */

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScottProfile 
{
	private static JFrame frame = new JFrame("About Scott McKay");
	private static JButton close = new JButton("Close");
	
	static void createWindow() 
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				//------------------------------------------------------// Attributes
				JPanel mainPanel = new JPanel();

				
				//------------------------------------------------------// Frame Parameters
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setPreferredSize(new Dimension(1346, 800));
				frame.pack();
				frame.setLocationByPlatform(true);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.add(mainPanel);
				//------------------------------------------------------// Panel Parameters
				
				
				close.addActionListener(new ButtonListener());
				mainPanel.add(new ImageLoad(1346, 800, "images/scott_mckay.jpg"));
				mainPanel.add(close);
			}
		});
	}
	
	private static class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event) 
		{
			if (event.getSource() == close)
			{
				frame.dispose();
			}
		}
	}
}