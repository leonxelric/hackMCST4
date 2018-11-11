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
		if(frame.isValid())
		{
			program.processFrame(frame);
		}
		for(int i = 0; i < 22; i++)
		{
			System.out.println("x at " + i + ": " + program.getCurrentPosition().getXVals()[i]);
			System.out.println("y at " + i + ": " + program.getCurrentPosition().getZVals()[i]);
			System.out.println("z at " + i + ": " + program.getCurrentPosition().getYVals()[i]);
			System.out.println();
		}
//		System.out.println(program.getCurrentPosition().getXVals()[0]);
//		System.out.println(program.getCurrentPosition().getYVals()[0]);
//		System.out.println(program.getCurrentPosition().getZVals()[0]);
//		System.out.println();
	}
	
	public void drawBackground()
	{
		parent.background(255,0,0);
	}
	
	public void drawInterface()
	{
		parent.textSize(50);
		parent.fill(255);
		parent.text("Letter to sign: " + program.getLetterToSign(), 50, 50);
	}
	
	public void drawHand()
	{
		float[] xVals = program.getCurrentPosition().getXVals();
		float[] yVals = program.getCurrentPosition().getYVals();
		float[] zVals = program.getCurrentPosition().getZVals();
		parent.strokeWeight(5);
		parent.pushMatrix();
		parent.translate(parent.width/2, parent.height/2, 0);
		
		parent.pushMatrix();
		parent.translate(xVals[0]*2, yVals[0]*2, zVals[0]*2);
		parent.sphere(10);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[1]*2, yVals[1]*2, zVals[1]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[2]*2, yVals[2]*2, zVals[2]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[3]*2, yVals[3]*2, zVals[3]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[4]*2, yVals[4]*2, zVals[4]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[5]*2, yVals[5]*2, zVals[5]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[6]*2, yVals[6]*2, zVals[6]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[7]*2, yVals[7]*2, zVals[7]*2);
		parent.sphere(5);
		parent.popMatrix();		
		parent.pushMatrix();
		parent.translate(xVals[8]*2, yVals[8]*2, zVals[8]*2);
		parent.sphere(5);
		parent.popMatrix();		
		parent.pushMatrix();
		parent.translate(xVals[9]*2, yVals[9]*2, zVals[9]*2);
		parent.sphere(5);
		parent.popMatrix();		
		parent.pushMatrix();
		parent.translate(xVals[10]*2, yVals[10]*2, zVals[10]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[11]*2, yVals[11]*2, zVals[11]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[12]*2, yVals[12]*2, zVals[12]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[13]*2, yVals[13]*2, zVals[13]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[14]*2, yVals[14]*2, zVals[14]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[15]*2, yVals[15]*2, zVals[15]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[16]*2, yVals[16]*2, zVals[16]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[17]*2, yVals[17]*2, zVals[17]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[18]*2, yVals[18]*2, zVals[18]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[19]*2, yVals[19]*2, zVals[19]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[20]*2, yVals[20]*2, zVals[20]*2);
		parent.sphere(5);
		parent.popMatrix();
		parent.pushMatrix();
		parent.translate(xVals[21]*2, yVals[21]*2, zVals[21]*2);
		parent.sphere(5);
		parent.popMatrix();
		
		
		parent.beginShape();
		parent.vertex(xVals[1]*2, yVals[1]*2, zVals[1]*2);
		parent.vertex(xVals[5]*2, yVals[5]*2, zVals[5]*2);
		parent.vertex(xVals[9]*2, yVals[9]*2, zVals[9]*2);
		parent.vertex(xVals[13]*2, yVals[13]*2, zVals[13]*2);
		parent.vertex(xVals[17]*2, yVals[17]*2, zVals[17]*2);
		parent.vertex(xVals[21]*2, yVals[21]*2, zVals[21]*2);
		parent.vertex(xVals[1]*2, yVals[1]*2, zVals[1]*2);
		parent.endShape();
		
		//fingers
		parent.beginShape();
		parent.vertex(xVals[0]*2, yVals[0]*2, zVals[0]*2); //finger1
		parent.vertex(xVals[5]*2, yVals[5]*2, zVals[5]*2); 
		parent.vertex(xVals[6]*2, yVals[6]*2, zVals[6]*2);
		parent.vertex(xVals[7]*2, yVals[7]*2, zVals[7]*2);
		parent.vertex(xVals[8]*2, yVals[8]*2, zVals[8]*2);
		parent.vertex(xVals[7]*2, yVals[7]*2, zVals[7]*2);
		parent.vertex(xVals[6]*2, yVals[6]*2, zVals[6]*2);
		parent.vertex(xVals[5]*2, yVals[5]*2, zVals[5]*2);
		parent.vertex(xVals[0]*2, yVals[0]*2, zVals[0]*2); //finger2
		parent.vertex(xVals[9]*2, yVals[9]*2, zVals[9]*2);
		parent.vertex(xVals[10]*2, yVals[10]*2, zVals[10]*2);
		parent.vertex(xVals[11]*2, yVals[11]*2, zVals[11]*2);
		parent.vertex(xVals[12]*2, yVals[12]*2, zVals[12]*2);
		parent.vertex(xVals[11]*2, yVals[11]*2, zVals[11]*2);
		parent.vertex(xVals[10]*2, yVals[10]*2, zVals[10]*2);
		parent.vertex(xVals[9]*2, yVals[9]*2, zVals[9]*2);
		parent.vertex(xVals[0]*2, yVals[0]*2, zVals[0]*2); //finger3
		parent.vertex(xVals[13]*2, yVals[13]*2, zVals[13]*2);
		parent.vertex(xVals[14]*2, yVals[14]*2, zVals[14]*2);
		parent.vertex(xVals[15]*2, yVals[15]*2, zVals[15]*2);
		parent.vertex(xVals[16]*2, yVals[16]*2, zVals[16]*2);
		parent.vertex(xVals[15]*2, yVals[15]*2, zVals[15]*2);
		parent.vertex(xVals[14]*2, yVals[14]*2, zVals[14]*2);
		parent.vertex(xVals[13]*2, yVals[13]*2, zVals[13]*2);
		parent.vertex(xVals[0]*2, yVals[0]*2, zVals[0]*2); //finger4
		parent.vertex(xVals[17]*2, yVals[17]*2, zVals[17]*2);
		parent.vertex(xVals[18]*2, yVals[18]*2, zVals[18]*2);
		parent.vertex(xVals[19]*2, yVals[19]*2, zVals[19]*2);
		parent.vertex(xVals[20]*2, yVals[20]*2, zVals[20]*2);
		parent.vertex(xVals[19]*2, yVals[19]*2, zVals[19]*2);
		parent.vertex(xVals[18]*2, yVals[18]*2, zVals[18]*2);
		parent.vertex(xVals[17]*2, yVals[17]*2, zVals[17]*2);
		parent.vertex(xVals[0]*2, yVals[0]*2, zVals[0]*2);
		parent.endShape();

		//thumb
		parent.beginShape();
		parent.vertex(xVals[1]*2, yVals[1]*2, zVals[1]*2);
		parent.vertex(xVals[2]*2, yVals[2]*2, zVals[2]*2);
		parent.vertex(xVals[3]*2, yVals[3]*2, zVals[3]*2);
		parent.vertex(xVals[4]*2, yVals[4]*2, zVals[4]*2);
		parent.vertex(xVals[3]*2, yVals[3]*2, zVals[3]*2);
		parent.vertex(xVals[2]*2, yVals[2]*2, zVals[2]*2);
		parent.vertex(xVals[1]*2, yVals[1]*2, zVals[1]*2);
		parent.endShape();
		
		parent.popMatrix();
	}
}
