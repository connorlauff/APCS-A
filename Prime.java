//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{


	}

	public Prime(int num)
	{
		number = num;

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		for(int i=2;i<number;i++) {
	        if(number%i==0)
	            return false;
		}





		return true;
	}

	public String toString()
	{
		String output = "a";
		if (isPrime() == true)
			output = (number + " is prime");
		else
			output = (number + " is not prime");






		return output;
	}
}