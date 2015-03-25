/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	private static final int BIG_RED_RADIUS = 72;
	private static final int WHITE_RADIUS = 47;
	private static final int SMALL_RED_RADIUS = 22;
	
	public void run() {
		GOval bigRedOval=new GOval(getWidth()/2-BIG_RED_RADIUS,getHeight()/2-BIG_RED_RADIUS,2*BIG_RED_RADIUS,2*BIG_RED_RADIUS);
		bigRedOval.setFillColor(Color.RED);
		bigRedOval.setFilled(true);
		bigRedOval.setColor(Color.RED);
		add(bigRedOval);
		GOval whiteOval=new GOval(getWidth()/2-WHITE_RADIUS,getHeight()/2-WHITE_RADIUS,2*WHITE_RADIUS,2*WHITE_RADIUS);
		whiteOval.setFillColor(Color.WHITE);
		whiteOval.setFilled(true);
		whiteOval.setColor(Color.WHITE);
		add(whiteOval);
		GOval smallRedOval=new GOval(getWidth()/2-SMALL_RED_RADIUS,getHeight()/2-SMALL_RED_RADIUS,2*SMALL_RED_RADIUS,2*SMALL_RED_RADIUS);
		smallRedOval.setFillColor(Color.RED);
		smallRedOval.setFilled(true);
		smallRedOval.setColor(Color.RED);
		add(smallRedOval);
	}
}
