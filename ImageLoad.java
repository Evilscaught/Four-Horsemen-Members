import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class ImageLoad extends Component {

	BufferedImage img;
	private int x_size, y_size;
	
	public ImageLoad(int xs, int ys) {
		super();
		
		this.x_size = xs;
		this.y_size = ys;
		
		LoadImageApp();
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.x_size, this.y_size, null);
	}

	public void LoadImageApp() {
		try {
			img = ImageIO.read(new File(Paths.get("./jackcummings.jpg").toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Dimension getPreferredSize() {
		return new Dimension(this.x_size, this.y_size);
	}
}