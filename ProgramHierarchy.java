/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final int MAGNIFIER = 2;
	private static final int BOX_WIDTH = 100*MAGNIFIER;
	private static final int BOX_HEIGHT = 30*MAGNIFIER;
	private static final int BOX_X_INTERVAL = 15*MAGNIFIER;
	private static final int BOX_Y_INTERVAL = 30*MAGNIFIER;
	
	public void run() {
		int consoleProgramBox_X = getWidth()/2-BOX_WIDTH/2;
		int consoleProgramBox_Y = getHeight()/2;
		int graphicsProgramBox_X = consoleProgramBox_X-BOX_WIDTH-BOX_X_INTERVAL;
		int graphicsProgramBox_Y = consoleProgramBox_Y;
		int dialogProgramBox_X = getWidth()/2+BOX_WIDTH/2+BOX_X_INTERVAL;
		int dialogProgramBox_Y = consoleProgramBox_Y;
		int programBox_X=consoleProgramBox_X;
		int programBox_Y=getHeight()/2-BOX_HEIGHT-BOX_Y_INTERVAL;
		
		GRect graphicsProgramBox = new GRect(graphicsProgramBox_X,graphicsProgramBox_Y,BOX_WIDTH,BOX_HEIGHT);
		GRect consoleProgramBox = new GRect(consoleProgramBox_X,consoleProgramBox_Y,BOX_WIDTH,BOX_HEIGHT);
		GRect dialogProgramBox = new GRect(dialogProgramBox_X,dialogProgramBox_Y,BOX_WIDTH,BOX_HEIGHT);
		GRect programBox = new GRect(programBox_X,programBox_Y,BOX_WIDTH,BOX_HEIGHT);
		add(graphicsProgramBox);
		add(consoleProgramBox);
		add(dialogProgramBox);
		add(programBox);
		
		GLine graphicsLine = new GLine(getWidth()/2, programBox_Y+BOX_HEIGHT,graphicsProgramBox_X+BOX_WIDTH/2,graphicsProgramBox_Y);
		GLine consoleLine = new GLine(getWidth()/2, programBox_Y+BOX_HEIGHT,consoleProgramBox_X+BOX_WIDTH/2,consoleProgramBox_Y);
		GLine dialogLine = new GLine(getWidth()/2, programBox_Y+BOX_HEIGHT,dialogProgramBox_X+BOX_WIDTH/2,dialogProgramBox_Y);
		add(graphicsLine);
		add(dialogLine);
		add(consoleLine);
		
		GLabel graphicsLabel = new GLabel("Graphics Program", graphicsProgramBox_X+BOX_WIDTH/2,graphicsProgramBox_Y+BOX_HEIGHT/2);
		graphicsLabel.setFont("SansSerif-20");
		graphicsLabel.move(-graphicsLabel.getWidth()/2,graphicsLabel.getAscent()/2);
		add(graphicsLabel);
		GLabel dialogLabel = new GLabel("Dialog Program", dialogProgramBox_X+BOX_WIDTH/2,dialogProgramBox_Y+BOX_HEIGHT/2);
		dialogLabel.setFont("SansSerif-20");
		dialogLabel.move(-dialogLabel.getWidth()/2,dialogLabel.getAscent()/2);
		add(dialogLabel);
		GLabel consoleLabel = new GLabel("Console Program", consoleProgramBox_X+BOX_WIDTH/2,consoleProgramBox_Y+BOX_HEIGHT/2);
		consoleLabel.setFont("SansSerif-20");
		consoleLabel.move(-consoleLabel.getWidth()/2,consoleLabel.getAscent()/2);
		add(consoleLabel);
		GLabel programLabel = new GLabel("Program", programBox_X+BOX_WIDTH/2,programBox_Y+BOX_HEIGHT/2);
		programLabel.setFont("SansSerif-20");
		programLabel.move(-programLabel.getWidth()/2,programLabel.getAscent()/2);
		add(programLabel);
		
	}
}

