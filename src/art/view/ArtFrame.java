package art.view;

import javax.swing.JFrame;
import art.controller.ArtController;
import art.view.ArtPanel;

public class ArtFrame extends JFrame
{
	private ArtController app;
	private ArtPanel appPanel;
	private ArtController appController;
	
	public ArtFrame()
	{
		super();
		
		setupFrame();
		
		this.appController = appController;
		this.appPanel = new ArtPanel(appController);
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
