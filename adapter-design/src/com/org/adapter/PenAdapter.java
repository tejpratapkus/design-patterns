package com.org.adapter;

import com.org.Pen;
import com.org.pen.PilotPen;

public class PenAdapter implements Pen {

	private PilotPen pilotPen = new PilotPen();
	
	@Override
	public void write(String content) {
		pilotPen.mark(content);
	}

}
