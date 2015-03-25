/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	public void run()
	{
	int iLargest=0;
	int iSmallest=0;
	int iInput=1;
	println("This program finds the smallest and the largest numbers.");
	iInput=readInt();
	if (iInput!=0)
	{
		iLargest=iInput;
		iSmallest=iInput;
		iInput=readInt();
		while (iInput!=0)
		{
			if (iInput>iLargest)
				iLargest=iInput;
			if (iInput<iSmallest)
				iSmallest=iInput;
			iInput=readInt();
		}
		println("smallest: "+iSmallest);
		println("largest: "+iLargest);
		
	}
	else
		println("No numbers were inputed");
	
	}
}

