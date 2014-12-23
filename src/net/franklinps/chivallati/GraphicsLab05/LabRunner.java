package net.franklinps.chivallati.GraphicsLab05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by CompSci-04 on 12/16/2014.
 */
public class LabRunner extends Applet
{

	public void paint(Graphics g)
	{

		new Frame( g , 10 , 10 , 800 , 600 );

		new Present( g , 50 , 50 , 75 , 50 , 2 );

	}

}