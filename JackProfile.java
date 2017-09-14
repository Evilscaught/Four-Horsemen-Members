import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.DefaultCaret;

public class JackProfile {

	static void createWindow() {
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				String content = "";
				try {
					content = new String(Files.readAllBytes(Paths.get("./jackcummings.txt")), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				JFrame frame = new JFrame("About Jack Cummings");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								
				JTextArea textArea = new JTextArea(20, 15);
				textArea.setWrapStyleWord(true);
				textArea.setLineWrap(true);
				textArea.setEditable(false);
				textArea.setFont(Font.getFont(Font.SANS_SERIF));
				
				JScrollPane scroller = new JScrollPane(textArea);
				scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				
				JButton button = new JButton("Close");
				button.addActionListener( new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						frame.dispose();
					}
				});
				
				JPanel bottomPanel = new JPanel();
				bottomPanel.setLayout(new FlowLayout());
				bottomPanel.add(button);		
				
				JPanel panel = new JPanel();
				panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
				panel.setOpaque(true);
				panel.add(scroller);
				panel.add(new ImageLoad(200, 250));
				panel.add(bottomPanel);

				frame.getContentPane().add(BorderLayout.CENTER, panel);
				frame.pack();
				
				frame.setLocationByPlatform(true);
				frame.setVisible(true);
				frame.setResizable(false);

				textArea.setText(content);
			}
		});
	}
}