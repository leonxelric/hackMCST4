package project;

import com.leapmotion.leap.*;

import processing.core.*;

public class UserInterface {
	private PApplet parent;
	private PImage image;
	private String imagePath;
	private Controller controller;
//	private Frame frame;
	private Program program;
	
	public UserInterface(PApplet parent, Controller controller)
	{
		this.parent = parent;
		this.controller = controller;
		program = new Program();
	}
	
	public void update()
	{
		Frame frame = controller.frame();
		if (frame.isValid())
		{
			program.processFrame(frame);
		}
	}
	
	public void drawBackground(Frame frame)
	{
		
	}
	
	public void drawInterface()
	{
		
	}
	
	public void drawHUD()
	{
		
	}
}
