package art.view;

import art.controller.ArtController;
import javax.swing.*;

public class ArtPanel extends JPanel
{
	private ArtController app;
	
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private JButton orangeButton;
	private JButton greenButton;
	private JButton violetButton;
	private JButton magentaButton;
	
	public ArtPanel(ArtController app)
	{
		super();
		this.app = app;
		
		redButton = new JButton("Red");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		orangeButton = new JButton("Orange");
		greenButton = new JButton("Green");
		violetButton = new JButton("Violet");
		magentaButton = new JButton("Magenta");
		
		setupMenuPanel();
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupMenuPanel()
	{
		this.add(redButton);
		this.add(blueButton);
		this.add(yellowButton);
		this.add(orangeButton);
		this.add(greenButton);
		this.add(violetButton);
		this.add(magentaButton);
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
