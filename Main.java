import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants; 

public class Main {
	private static void createWindow() {
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				JFrame frame = new JFrame("About Our Biz");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container container = frame.getContentPane();

				JLabel textLabel = new JLabel("<<INSERT COMPANY NAME HERE>>",SwingConstants.CENTER); 
				textLabel.setPreferredSize(new Dimension(300, 100)); 

				JButton button = new JButton("Jack Cummings");
				button.addActionListener( new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Jack.createWindow();
					}
				});

				container.add(textLabel, BorderLayout.CENTER); 
				container.add(button, BorderLayout.SOUTH);

				frame.pack();

				frame.setLocationByPlatform(true);
				frame.setVisible(true); 
				frame.setResizable(false);
			}
		});
	}
	
	public static void main(String[] args) {
		createWindow();
	}
}