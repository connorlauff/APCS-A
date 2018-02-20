//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		//add test cases
		Prime test = new Prime();
		test.setPrime(24);
		test.isPrime();
		System.out.println(test.toString());
		Prime test1 = new Prime();
		test1.setPrime(7);
		test1.isPrime();
		System.out.println(test1.toString());
		Prime test2 = new Prime();
		test2.setPrime(100);
		test2.isPrime();
		System.out.println(test2.toString());
		Prime test3 = new Prime();
		test3.setPrime(113);
		test3.isPrime();
		System.out.println(test3.toString());
		Prime test4 = new Prime();
		test4.setPrime(65535);
		test4.isPrime();
		System.out.println(test4.toString());
		
	}	
}