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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class ScottProfile 
{
	static void createWindow() 
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				JFrame frame = new JFrame("About Scott McKay");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setPreferredSize(new Dimension(800, 600));
				frame.pack();
				
				frame.setLocationByPlatform(true);
				frame.setVisible(true);
				frame.setResizable(false);
				
				JPanel mainPanel = new JPanel();
				frame.add(mainPanel);
				
				JButton button = new JButton("Close");
				button.addActionListener( new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						frame.dispose();
					}
				});
				mainPanel.add(button);
			}
		});
	}
}