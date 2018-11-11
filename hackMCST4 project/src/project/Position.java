package project;

public class Position {
	private float[] xVals;
	private float[] yVals;
	private float[] zVals;
	
	public Position()
	{
		xVals = new float[22];
		yVals = new float[22];
		zVals = new float[22];
	}
	
	public Position(float[] rawXVals, float[] rawYVals, float[] rawZVals)
	{
		float xOrigin = rawXVals[0];
		float yOrigin = rawYVals[0];
		float zOrigin = rawZVals[0];
		
		xVals = new float[22];
		yVals = new float[22];
		zVals = new float[22];
		
		for(int i = 0; i < xVals.length; i++)
		{
			xVals[i] = rawXVals[i] - xOrigin;
		}
		for(int i = 0; i < yVals.length; i ++)
		{
			yVals[i] = rawYVals[i] - yOrigin;
		}
		for(int i = 0; i < zVals.length; i ++)
		{
			zVals[i] = rawZVals[i] - zOrigin;
		}
		//for loop that loops through x vals and subtracts x origin from each
		//ditto for y and z
	}
	
	public boolean closeEnough(Position other)
	{
		for(int i = 0; i < 22; i++)
		{
			if((Math.abs(xVals[i] - other.xVals[i])) > 20)
				return false;
			if((Math.abs(yVals[i] - other.yVals[i])) > 20)
				return false;
			if((Math.abs(zVals[i] - other.zVals[i])) > 20)
				return false;
		}
		
		return true;
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