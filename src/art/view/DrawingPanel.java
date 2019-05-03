package art.view;

import javax.swing.JPanel;
import art.controller.ArtController;

public class DrawingPanel extends JPanel
{
	private ArtController app;
	
	public DrawingPanel(ArtController app)
	{
		super();
		this.app = app;
	}
	
}
