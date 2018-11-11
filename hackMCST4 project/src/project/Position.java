package project;

public class Position {
	private int[] xVals;
	private int[] yVals;
	private int[] zVals;
	
	public Position(int[] xV, int[] yV, int[] zV)
	{
		
	}
	
	public boolean closeEnough(Position other)
	{
		return false;
	}
	
	public int[] getXVals()
	{
		return xVals;
	}
	
	public int[] getYVals()
	{
		return yVals;
	}
	
	public int[] getZVals()
	{
		return zVals;
	}
}