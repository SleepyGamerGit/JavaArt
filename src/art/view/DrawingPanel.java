package art.view;

import javax.swing.JPanel;
import art.controller.ArtController;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DrawingPanel extends JPanel
{
	private ArtController app;
	private Color currentColor;
	private BufferedImage currentCanvas;
	private int previousX;
	private int previousY;

	public DrawingPanel(ArtController app)
	{
		super();
		this.app = app;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);
		setupPanel();
		resetPoint();
	}

	public void resetPoint()
	{
		previousX = Integer.MIN_VALUE;
		previousY = Integer.MIN_VALUE;
	}

	public void setupPanel()
	{
		this.setPreferredSize(new Dimension(700, 700));
		this.setBackground(Color.MAGENTA);
		this.currentColor = Color.GREEN;
	}

	@Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.drawImage(currentCanvas, 0, 0, null);
	}

	private Color randomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int alpha = (int) (Math.random() * 256);

		Color randomColor = new Color(red, green, blue, alpha);
		return randomColor;
	}

	public void setCurrentColor(String color)
	{
		if (color.equalsIgnoreCase("Red"))
		{
			currentColor = Color.RED;
		}
		else if (color.equalsIgnoreCase("blue"))
		{
			currentColor = Color.BLUE;
		}
		else if (color.equalsIgnoreCase("yellow"))
		{
			currentColor = Color.YELLOW;
		}
		else if (color.equalsIgnoreCase("Orange"))
		{
			currentColor = Color.ORANGE;
		}
		else if (color.equalsIgnoreCase("green"))
		{
			currentColor = Color.GREEN;
		}
		else if (color.equalsIgnoreCase("violet"))
		{
			currentColor = new Color(75, 0, 130);
		}
		else if (color.equalsIgnoreCase("magenta"))
		{
			currentColor = Color.MAGENTA;
		}
		else
		{
			currentColor = randomColor();
		}
	}

	public void drawDot(int currentX, int currentY, int width)
	{
		Graphics2D current = currentCanvas.createGraphics();
		current.setColor(currentColor);
		current.setStroke(new BasicStroke(width));
		current.drawOval(currentX, currentY, width, width);
		repaint();
	}
	
	
}
