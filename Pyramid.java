/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	private int bricksInLine=BRICKS_IN_BASE;
	private int line=0;
	
	public void run() {
		
		while(bricksInLine>0)
		{
			makeLine();
			line++;
			bricksInLine--;
		}
		
	}
	private void makeLine()
	{
		for (int i=0; i<bricksInLine; i++)
		{	
			add(new GRect(getWidth()/2-bricksInLine*BRICK_WIDTH/2+i*BRICK_WIDTH,getHeight()-line*BRICK_HEIGHT,BRICK_WIDTH,BRICK_HEIGHT));
	
		}
	}
	
}

