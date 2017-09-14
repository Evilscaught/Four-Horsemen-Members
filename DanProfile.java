/*Author(s): 				Dan Bailey
 *Contributing Author(s): 	Jack Cummings, Scott McKay
 *Name of Group:			The Four Horsemen
 *Date Created: 			Wednesday, September 13th, 2017 @10:30 p.m. MST
 *Class:					Software Science [CSCI 323-01]
 *Purpose of Class:			Dans  Profile
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


public class DanProfile
{
	private static JFrame profileFrame = new JFrame("About Dan Bailey");
	private static JButton close = new JButton("Close");


	static void createWindow()
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				JPanel profilePanel = new JPanel();
			JLabel aboutMe = new JLabel("<html>Name: Dan <br>Age: 26<br>I was born in missoula, I have an A.A degree from U of M<br>"+
            "This is my third year in the computer science program. <br>I love being outside, hunting, fishing and pretty much all of that<br>"+
            "I love sports, and Dogs are my favorite!</html>");

				profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				profileFrame.setPreferredSize(new Dimension(500, 700));
				profileFrame.pack();
				profileFrame.setLocationByPlatform(true);
				profileFrame.setVisible(true);
				profileFrame.setResizable(true);
				profileFrame.add(profilePanel);


				close.addActionListener(new ButtonListener());

				profilePanel.add(new ImageLoad(500, 500, "images/Dan.jpg"));
				profilePanel.add(aboutMe);
				profilePanel.add(close, BorderLayout.SOUTH);

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

		}
	}

}
