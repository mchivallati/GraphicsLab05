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
		
		Point p1 = new Point( 40 , 200 );
		Point p2 = new Point( 120 , 205 );

		new Frame( g , 10 , 10 , 300 , 250 );

		new Present( g , p1.getX() , p1.getY( ) , 30 , 15 , 1 );

		new Present( g , p2.getX( ) , p2.getY( ) , 40 , 15 , 2 );
		
		new ChristmasTree( g , 50 , 50 );

	}

}