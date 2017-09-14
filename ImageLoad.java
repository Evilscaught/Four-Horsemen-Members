/*Author(s): 				Jack Cummings
 *Contributing Author(s): 	Scott McKay
 *Name of Group:			The Four Horsemen
 *Date Created: 			Wednesday, September 11th, 2017
 *Class:					Software Science [CSCI 323-01]
 *Purpose of Class:			Draws image to jpanel.
 */

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class ImageLoad extends Component {

	private static final long serialVersionUID = 743634615277090620L;
	
	BufferedImage img;
	private String path;
	private int x_size, y_size;
	
	public ImageLoad(int xs, int ys, String path)
	{
		super();
		
		this.x_size = xs;
		this.y_size = ys;
		this.path = path;
		
		LoadImageApp();
	}

	public void paint(Graphics g) 
	{
		g.drawImage(img, 0, 0, this.x_size, this.y_size, null);
	}

	public void LoadImageApp() 
	{
		try 
		{
			img = ImageIO.read(new File(Paths.get(path).toString()));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

	public Dimension getPreferredSize() 
	{
		return new Dimension(this.x_size, this.y_size);
	}
}