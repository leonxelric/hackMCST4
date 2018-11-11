package project;

import com.leapmotion.leap.*;

public class Program {
	private String letterToSign;
	private final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
			"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	public Program()
	{
		
	}
	
	public void processFrame(Frame frame)
	{
		
	}
	
	public boolean closeEnough()
	{
		return false;
	}
	
	public String getLetterToSign()
	{
		return letterToSign;
	}
	
	public String setRandomLetter()
	{
		int r = (int)(Math.random() * 26);
		letterToSign = alphabet[r];
		
	}
}
