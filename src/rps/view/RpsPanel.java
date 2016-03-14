package rps.view;

import rps.controller.RpsController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class RpsPanel extends JPanel 
{
private SpringLayout baseLayout;	
private RpsController baseController;
private JLabel playerOne;
private JPasswordField inputOne;
private JLabel playerTwo;
private JPasswordField inputTwo;
private JButton submitRps;

public RpsPanel(RpsController baseController)
{
submitRps = new JButton("Ready");
playerOne = new JLabel("Player One");
playerTwo = new JLabel("Player Two");
inputTwo = new JPasswordField("",10);
inputOne = new JPasswordField("",10);	
this.baseController = baseController;
baseLayout = new SpringLayout();



setupPanel();
setupLayout();
setupListeners();

}

private void setupPanel()
{
	this.add(submitRps);
	this.add(playerTwo);
	this.add(playerOne);
	this.add(inputOne);
	this.add(inputTwo);
	this.setLayout(baseLayout);
	
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, submitRps, 6, SpringLayout.SOUTH, inputOne);
	baseLayout.putConstraint(SpringLayout.EAST, submitRps, -111, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, playerOne, 0, SpringLayout.NORTH, playerTwo);
	baseLayout.putConstraint(SpringLayout.WEST, playerOne, 37, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, playerTwo, -6, SpringLayout.NORTH, inputTwo);
	baseLayout.putConstraint(SpringLayout.EAST, playerTwo, -33, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, inputTwo, 0, SpringLayout.NORTH, inputOne);
	baseLayout.putConstraint(SpringLayout.EAST, inputTwo, -10, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.WEST, inputOne, 10, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, inputOne, -42, SpringLayout.SOUTH, this);
}

private void setupListeners()
{
	
	
}

}