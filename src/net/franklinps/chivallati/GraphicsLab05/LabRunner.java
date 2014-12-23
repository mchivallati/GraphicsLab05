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

		theFrame( g );

		new Present( g , 50 , 50 , 200 , 150 , 2 );

	}

	void theFrame(Graphics g)
	{

		Frame scene = new Frame( 360 , 285 , 10 , 10 );

		scene.frameBorder( g );

	}

}