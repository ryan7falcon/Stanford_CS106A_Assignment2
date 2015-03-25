/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int iNumber = readInt("Enter a number: ");
		int i=0;
		while (iNumber!=1)
		{
			if (iNumber%2==0)
			{	
				println(iNumber + " is even so I take half: " + iNumber/2);
				iNumber/=2;
				i++;
			}
			else
			{
				println(iNumber + " is odd, so I make 3n+1: " + (3*iNumber+1));
				iNumber=3*iNumber+1;
				i++;
			}
		}
		println("The process took " + i + " to reach 1");
	}
}

