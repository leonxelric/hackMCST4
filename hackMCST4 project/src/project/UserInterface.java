package project;

import com.leapmotion.leap.*;

import processing.core.*;

public class UserInterface {
	private PApplet parent;
	private Controller controller;
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
		parent.fill(0);
		parent.background(0);
	}
	
	public void drawInterface()
	{
		parent.textSize(50);
		parent.fill(255);
		parent.text("Letter to sign: " + program.getLetterToSign(), 50, 50);
	}
	
	public void drawHand()
	{
		int[] xVals = program.getCurrentPosition().getXVals();
		int[] yVals = program.getCurrentPosition().getYVals();
		int[] zVals = program.getCurrentPosition().getZVals();
		
		parent.translate(parent.width, parent.height, 0);
		
		parent.beginShape();
		parent.vertex(xVals[0], yVals[0], zVals[0]); //represents the position of palm
		parent.vertex(xVals[1], yVals[1], zVals[1]); //represents the position of 
		parent.vertex(xVals[2], yVals[2], zVals[2]); //
		parent.endShape();
	}
}
