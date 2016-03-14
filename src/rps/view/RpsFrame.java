package rps.view;

import javax.swing.JFrame;
import rps.controller.RpsController;

public class RpsFrame extends JFrame
{
private RpsPanel basePanel;
private RpsController baseController;

public RpsFrame(RpsController baseController)
{
	this.baseController = baseController;
	basePanel = new RpsPanel(baseController);
	setupFrame();
}
private void setupFrame()
{
	this.setContentPane(basePanel);
	this.setSize(300, 300);
	this.setResizable(false);
	this.setTitle("Rock Paper Scissors");
	this.setVisible(true);
}
	
	
}