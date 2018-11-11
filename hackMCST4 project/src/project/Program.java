package project;

import com.leapmotion.leap.*;

public class Program {
	private String letterToSign = "a";
//	private final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
//			"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	private final String[] alphabet = {"a", "b", "c"};
	private Position currentPosition;
	
	public Program()
	{
		currentPosition = new Position();
	}
	
	public void processFrame(Frame frame)
	{
		updateCurrentPosition(frame);
//		if(currentPosition.closeEnough(new Position(CorrectData.getCorrectData("letterToSign")[0],
//											CorrectData.getCorrectData("letterToSign")[1],
//											CorrectData.getCorrectData("letterToSign")[2])))
//			setDifferentRandomLetter();
	}
	
	private void updateCurrentPosition(Frame frame)
	{
		float[] rawXValues = new float[22];
		float[] rawYValues = new float[22];
		float[] rawZValues = new float[22];
		
		HandList handlist = frame.hands();
		for(Hand h : handlist)
		{
			rawXValues[0] = h.palmPosition().getX();
			rawYValues[0] = h.palmPosition().getZ();
			rawZValues[0] = h.palmPosition().getY();
		}
		
		for(Finger f : frame.fingers())
		{
			for(Bone.Type bt : Bone.Type.values())
			{
				if(f.type() == Finger.Type.TYPE_THUMB)
				{
					if(bt == Bone.Type.TYPE_PROXIMAL)
					{
						setValues(1, f, bt, rawXValues, rawYValues, rawZValues, false);
						setValues(2, f, bt, rawXValues, rawYValues, rawZValues, true);
					}
					else if(bt == Bone.Type.TYPE_INTERMEDIATE)
						setValues(3, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_DISTAL)
						setValues(4, f, bt, rawXValues, rawYValues, rawZValues, true);
				}
				else if(f.type() == Finger.Type.TYPE_INDEX)
				{
					if(bt == Bone.Type.TYPE_METACARPAL)
						setValues(5, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_PROXIMAL)
						setValues(6, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_INTERMEDIATE)
						setValues(7, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_DISTAL)
						setValues(8, f, bt, rawXValues, rawYValues, rawZValues, true);
				}
				else if(f.type() == Finger.Type.TYPE_MIDDLE)
				{
					if(bt == Bone.Type.TYPE_METACARPAL)
						setValues(9, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_PROXIMAL)
						setValues(10, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_INTERMEDIATE)
						setValues(11, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_DISTAL)
						setValues(12, f, bt, rawXValues, rawYValues, rawZValues, true);
				}
				else if(f.type() == Finger.Type.TYPE_RING)
				{
					if(bt == Bone.Type.TYPE_METACARPAL)
						setValues(13, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_PROXIMAL)
						setValues(14, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_INTERMEDIATE)
						setValues(15, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_DISTAL)
						setValues(16, f, bt, rawXValues, rawYValues, rawZValues, true);
				}
				else if(f.type() == Finger.Type.TYPE_PINKY)
				{
					if(bt == Bone.Type.TYPE_METACARPAL)
					{
						setValues(17, f, bt, rawXValues, rawYValues, rawZValues, true);
						setValues(21, f, bt, rawXValues, rawYValues, rawZValues, false);
					}
					else if(bt == Bone.Type.TYPE_PROXIMAL)
						setValues(18, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_INTERMEDIATE)
						setValues(19, f, bt, rawXValues, rawYValues, rawZValues, true);
					else if(bt == Bone.Type.TYPE_DISTAL)
						setValues(20, f, bt, rawXValues, rawYValues, rawZValues, true);
				}
			}
		}
		
		currentPosition = new Position(rawXValues, rawYValues, rawZValues);
	}
	
	private void setValues(int i, Finger f, Bone.Type bt, float[] xV, float[] yV, float[] zV, boolean nextJoint)
	{
		if(! nextJoint)
		{
			xV[i] = f.bone(bt).prevJoint().getX();
			yV[i] = f.bone(bt).prevJoint().getZ();
			zV[i] = f.bone(bt).prevJoint().getY();
		}
		else 
		{
			xV[i] = f.bone(bt).nextJoint().getX();
			yV[i] = f.bone(bt).nextJoint().getZ();
			zV[i] = f.bone(bt).nextJoint().getY();
		}
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
//		int r = (int)(Math.random() * 26);
		int r = (int)(Math.random() * 3);
		while(r == indexOf(alphabet, letterToSign))
		{
//			r = (int)(Math.random() * 23);
//			int r = (int)(Math.random() * 3);
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
