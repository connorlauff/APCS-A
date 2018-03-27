//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{		{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};

	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		int counter = 0;
		if(atMat[r][c] =='-' || r<0 || r>9 || c>9 || c<0){
            		return 0;
        	}

        if(atMat[r][c]=='@'){
        	atMat[r][c] = 'v';
        	counter++;
            	if(atMat[r-1][c]=='@' && 0<=r && r<=9 && 0<=c && c<=9){
                    counter = counter + countAts(r - 1, c);
            	}
            	if(atMat[r+1][c]=='@' && 0<=r && r<=9 && 0<=c && c<=9){
            		counter = counter + countAts(r + 1, c);
            	}
            	if(atMat[r][c+1]=='@' && 0<=r && r<=9 && 0<=c && c<=9){
            		counter = counter + countAts(r , c + 1);
            	}
            	if(atMat[r][c-1]=='@' && 0<=r && r<=9 && 0<=c && c<=9){
            		counter = counter + countAts(r, c - 1);
            	}
        }
        atCount = counter;
        return atCount;    
    }
             
  


	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output= "";
		output+=getAtCount()+" @s connected.";
		System.out.println(output); 
		return output;
	}
}
