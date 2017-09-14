/*Author(s): 		Scott McKay
 *Name of Group:	The Four Horsemen
 *Date Created: 	Wednesday, September 13th, 2017 @10:30 p.m. MST
 *Class:			Software Science [CSCI 323-01]
 *Purpose of Class:	Scott McKay's Profile
 */

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;


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
			}
		});
	}
}
