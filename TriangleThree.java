//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{

	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
		
	}

	public String getLetter()
	{
		
		return letter;
	}

	public String toString()
	{
		String output= "";
		for(int x=0; x<size; x++ )
		{
		for(int y=x; y<=size; y++ )
		      output = output + " ";				
		   for(int z=x; z>=0; z--)
			output = output+ letter;
		   output = output +"\n";
		}
		return output;
	}
}