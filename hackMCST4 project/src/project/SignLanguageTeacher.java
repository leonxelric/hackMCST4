package project;

import com.leapmotion.leap.*;

import processing.core.PApplet;

public class SignLanguageTeacher extends PApplet {
	private UserInterface ui;
	
	public static void main(String[] args)
	{
		PApplet.main("project.SignLanguageTeacher");
	}
	
	public void settings()
	{
		size(500, 500);
	}
	
	public void setup()
	{
		ui = new UserInterface(this, new Controller());
	}
	
	public void draw()
	{
		ui.update();
		ui.drawInterface();
	}
}
