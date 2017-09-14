/*Author(s): 				Scott McKay
 *Contributing Author(s): 	Jack Cummings
 *Name of Group:			The Four Horsemen
 *Date Created: 			Wednesday, September 13th, 2017 @10:30 p.m. MST
 *Class:					Software Science [CSCI 323-01]
 *Purpose of Class:			Scott McKay's Profile
 */
import java.awt.BorderLayout;
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
	private static JFrame profileFrame = new JFrame("About Scott McKay");
	private static JFrame gifFrame = new JFrame("Fanchy Smanchy Gif!");
	private static JButton close = new JButton("Close");
	private static JButton closeGif = new JButton("Close");
	private static JButton reqGifPanel = new JButton("Fanchy Smanchy GIF");

	static void createWindow()
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				//------------------------------------------------------// Attributes
				JPanel profilePanel = new JPanel();
				JLabel profileDescrip = new JLabel("<html>Born in Missoula, MT<br>Went to Hellgate High School<br>Thought this assignment was due on Friday for some reason...<br>"
						+ "A huge fan of pigeons (and birds in general)<br>Third year at the University of Montana<br>Graduating in a Masters Degree of Student Loan Debt</html>");

				//------------------------------------------------------// Frame Parameters
				profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				profileFrame.setPreferredSize(new Dimension(1346, 1000));
				profileFrame.pack();
				profileFrame.setLocationByPlatform(true);
				profileFrame.setVisible(true);
				profileFrame.setResizable(true);
				profileFrame.add(profilePanel);
				//------------------------------------------------------// Panel Parameters

				close.addActionListener(new ButtonListener());
				reqGifPanel.addActionListener(new ButtonListener());

				profilePanel.add(new ImageLoad(1346, 800, "images/scott_mckay.jpg"));
				profilePanel.add(profileDescrip);
				profilePanel.add(close, BorderLayout.SOUTH);
				profilePanel.add(reqGifPanel);
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
				//Close profile
				profileFrame.dispose();
			}
			if (event.getSource() == reqGifPanel)
			{
				//Open new window containing .gif image
				createGifWindow();
			}
			if (event.getSource() == closeGif)
			{
				//Close window containing .gif image
				gifFrame.dispose();
			}
		}
	}

	private static void createGifWindow()
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				//------------------------------------------------------// Attributes
				JPanel 	  gifPanel = new JPanel();
				ImageIcon gifPath = new ImageIcon("images/sunglasses_fail.gif");
				JLabel    gif = new JLabel(gifPath);


				//------------------------------------------------------// Frame Parameters
				gifFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				gifFrame.setPreferredSize(new Dimension(365, 275));
				gifFrame.pack();
				gifFrame.setLocationByPlatform(true);
				gifFrame.setVisible(true);
				gifFrame.setResizable(false);
				//------------------------------------------------------// Panel Parameters
				gifFrame.add(gifPanel);

				closeGif.addActionListener(new ButtonListener());

				gifPanel.add(gif);
				gifPanel.add(closeGif);
			}
		});
	}
}
