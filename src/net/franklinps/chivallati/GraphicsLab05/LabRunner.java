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

		Box b1 = new Box();
		
		b1.drawBox( g );
		
		Present p1 = new Present( 50 , 50 , 300 , 150 );

	}
}