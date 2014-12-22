package net.franklinps.chivallati.GraphicsLab05;

import java.awt.*;
import java.applet.*;

/**
 * Created by CompSci-04 on 12/16/2014.
 */
public class LabRunner extends Applet
{

	public void paint(Graphics g)
	{

		//theFrame( g );

		Present p1 = new Present( g , 50 , 50 , 200 , 150 , 1 );

	}

	public void theFrame(Graphics g)
	{

		Frame scene = new Frame( 200 , 200 , 200 , 200 );

		scene.frameBorder( g );

	}

}