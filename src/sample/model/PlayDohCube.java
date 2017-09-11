package sample.model;

public class PlayDohCube
{

	private int length;
	
	public PlayDohCube()
	{
		this.length = 7;
	}
	
	public PlayDohCube(int length)
	{
		this.length = length;
	}
	
	public String toString()
	{
		String description = "I am the ultimate PlayDohCube and I have a length of " + length;
		return description;
	}
}
