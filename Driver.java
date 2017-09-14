/*Author(s): 		Scott McKay
 *Name of Group:	The Four Horsemen
 *Date Created: 	Wednesday, September 13th, 2017 @9:40 p.m. MST
 *Class:			Software Science [CSCI 323-01]
 *Purpose of Class:	Driver class, main frame.
 */

import java.awt.Dimension;
import javax.swing.JFrame;


public class Driver 
{
	public static void main(String[] args)
	{
		JFrame driver = new JFrame("About Our Biz");
		driver.getContentPane().add(new Panel());
		driver.setPreferredSize(new Dimension(300, 300));
		driver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		driver.pack();
		driver.setVisible(true);
	}
}
