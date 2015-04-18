package com.geecat.steps.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {

	/**
	 <applet code=SimpleApplet" width=200 height=600>
	 </applet>
	 */
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g) {
		g.drawString("A simple Applet", 20, 20);
	}

}
