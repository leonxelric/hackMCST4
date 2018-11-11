package project;

import com.leapmotion.leap.*;

public class Program {
	private String letterToSign;
	private final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
			"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	private Position currentPosition;
	
	public Program()
	{
		
	}
	
	public void processFrame(Frame frame)
	{
		updateCurrentPosition(frame);
		if(currentPosition.closeEnough(new Position(CorrectData.getCorrectData("letterToSign")[0],
											CorrectData.getCorrectData("letterToSign")[1],
											CorrectData.getCorrectData("letterToSign")[2])));
	}
	
	private void updateCurrentPosition(Frame frame)
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
	
	public void setDifferentRandomLetter()
	{
		int r = (int)(Math.random() * 26);
		while(r == indexOf(alphabet, letterToSign))
		{
			r = (int)(Math.random() * 26);
		}
		letterToSign = alphabet[r];
	}
	
	private int indexOf(String[] arr, String val)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals(val))
				return i;
		}
		return -1;
	}
	
	public Position getCurrentPosition()
	{
		return currentPosition;
	}
}
