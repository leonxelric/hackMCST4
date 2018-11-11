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
		parent.vertex(xVals[1], yVals[1], zVals[1]);
		parent.vertex(xVals[5], yVals[5], zVals[5]);
		parent.vertex(xVals[9], yVals[9], zVals[9]);
		parent.vertex(xVals[13], yVals[13], zVals[13]);
		parent.vertex(xVals[17], yVals[17], zVals[17]);
		parent.vertex(xVals[21], yVals[21], zVals[21]);
		parent.vertex(xVals[1], yVals[1], zVals[1]);
		parent.endShape();
		
		//fingers
		parent.beginShape();
		parent.vertex(xVals[0], yVals[0], zVals[0]); //finger1
		parent.vertex(xVals[5], yVals[5], zVals[5]); 
		parent.vertex(xVals[6], yVals[6], zVals[6]);
		parent.vertex(xVals[7], yVals[7], zVals[7]);
		parent.vertex(xVals[8], yVals[8], zVals[8]);
		parent.vertex(xVals[7], yVals[7], zVals[7]);
		parent.vertex(xVals[6], yVals[6], zVals[6]);
		parent.vertex(xVals[5], yVals[5], zVals[5]);
		parent.vertex(xVals[0], yVals[0], zVals[0]); //finger2
		parent.vertex(xVals[9], yVals[9], zVals[9]);
		parent.vertex(xVals[10], yVals[10], zVals[10]);
		parent.vertex(xVals[11], yVals[11], zVals[11]);
		parent.vertex(xVals[12], yVals[12], zVals[12]);
		parent.vertex(xVals[11], yVals[11], zVals[11]);
		parent.vertex(xVals[10], yVals[10], zVals[10]);
		parent.vertex(xVals[9], yVals[9], zVals[9]);
		parent.vertex(xVals[0], yVals[0], zVals[0]); //finger3
		parent.vertex(xVals[13], yVals[13], zVals[13]);
		parent.vertex(xVals[14], yVals[14], zVals[14]);
		parent.vertex(xVals[15], yVals[15], zVals[15]);
		parent.vertex(xVals[16], yVals[16], zVals[16]);
		parent.vertex(xVals[15], yVals[15], zVals[15]);
		parent.vertex(xVals[14], yVals[14], zVals[14]);
		parent.vertex(xVals[13], yVals[13], zVals[13]);
		parent.vertex(xVals[0], yVals[0], zVals[0]); //finger4
		parent.vertex(xVals[17], yVals[17], zVals[17]);
		parent.vertex(xVals[18], yVals[18], zVals[18]);
		parent.vertex(xVals[19], yVals[19], zVals[19]);
		parent.vertex(xVals[20], yVals[20], zVals[20]);
		parent.vertex(xVals[19], yVals[19], zVals[19]);
		parent.vertex(xVals[18], yVals[18], zVals[18]);
		parent.vertex(xVals[17], yVals[17], zVals[17]);
		parent.vertex(xVals[0], yVals[0], zVals[0]);
		parent.endShape();

		//thumb
		parent.beginShape();
		parent.vertex(xVals[1], yVals[1], zVals[1]);
		parent.vertex(xVals[2], yVals[2], zVals[2]);
		parent.vertex(xVals[3], yVals[3], zVals[3]);
		parent.vertex(xVals[4], yVals[4], zVals[4]);
		parent.vertex(xVals[3], yVals[3], zVals[3]);
		parent.vertex(xVals[2], yVals[2], zVals[2]);
		parent.vertex(xVals[1], yVals[1], zVals[1]);
		parent.endShape();
		
		
	}
}
