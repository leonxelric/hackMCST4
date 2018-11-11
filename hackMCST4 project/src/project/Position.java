package project;

public class Position {
	private float[] xVals;
	private float[] yVals;
	private float[] zVals;
	
	public Position(float[] rawXVals, float[] rawYVals, float[] rawZVals)
	{
		float xOrigin = rawXVals[0];
		float yOrigin = rawYVals[0];
		float zOrigin = rawZVals[0];
		
		for(int i = 0; i < rawXVals.length; i++)
		{
			rawXVals[i] -= xOrigin;

		}
		for(int i = 0; i < rawYVals.length; i ++)
		{
			rawYVals[i] -= yOrigin;
		}
		for(int i = 0; i < rawZVals.length; i ++)
		{
			rawZVals[i] -= zOrigin;
		}
		//for loop that loops through x vals and subtracts x origin from each
		//ditto for y and z
	}
	
	public boolean closeEnough(Position other)
	{
		return false;
	}
	
	public float[] getXVals()
	{
		return xVals;
	}
	
	public float[] getYVals()
	{
		return yVals;
	}
	
	public float[] getZVals()
	{
		return zVals;
	}
}