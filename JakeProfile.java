/* Author: Jake Wolfe

 * 
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JakeProfile {
	
	private static JFrame profileFrame = new JFrame("About Jake Wolfe");
	private static JButton close = new JButton("Close");
	
	static void createWindow() {
		
		EventQueue.invokeLater(new Runnable()
				{
				@Override
				
			public void run()
			{
					
				JPanel profilePanel = new JPanel();
				JLabel profileLabel = new JLabel("<html>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Jake Wolfe<br><br>I am from Whitefish, MT.  I graduated from Whitefish High in 2008.<br>I am currently working as an IT technician at the Blewett School of Law.<br><br><br></html>");
				
				profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				profileFrame.setPreferredSize(new Dimension(450,700));
				profileFrame.pack();
				profileFrame.setLocationByPlatform(true);
				profileFrame.setVisible(true);
				profileFrame.setResizable(false);
				profileFrame.add(profilePanel);
				
				close.addActionListener(new ButtonListener());
			
				profilePanel.add(new ImageLoad(290,500,"images/jakewolfe.jpg"));
				profilePanel.add(profileLabel);
				profilePanel.add(close, BorderLayout.SOUTH);
				
			}
			
				
		});
		
	}

	private static class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource() == close)
			{
				profileFrame.dispose();
			}
		}
		
	}
	
	
	
	
}
