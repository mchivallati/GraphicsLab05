package net.franklinps.chivallati.GraphicsLab05;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/16/2014.
 */

public class Box
{

	private int topLeftX;	// top left X coordinate of the Box position
	private int topLeftY;	// top left y coordinate of the Box position
	private int width;	// width of the box
	private int height; // height of the box

	public Box()
	{
		
		topLeftX = 50;
		topLeftY = 50;
		width = 50;
		height = 25;
		
	}

	public Box( int x , int y , int w , int h )
	{
		
		topLeftX = x;
		topLeftY = y;
		width = w;
		height = h;
		
	}

	public void drawBox( Graphics g )
	{
		
		int topLeftX2 = topLeftX + width / 3;
		int topLeftY2 = topLeftY + height / 3;
		
		g.setColor( Color.black );
		
		g.drawRect( topLeftX , topLeftY , width , height );
		g.drawRect( topLeftX2 , topLeftY2 , width , height );
		
		g.drawLine( topLeftX , topLeftY , topLeftX2 , topLeftY2 );
		g.drawLine( topLeftX + width , topLeftY , topLeftX2 + width , topLeftY2 );
		g.drawLine( topLeftX , topLeftY + height , topLeftX2 , topLeftY2 + height );
		g.drawLine( topLeftX + width ,topLeftY + height , topLeftX2 + width , topLeftY2 + height );
		
	}

	public void moveBox( Graphics g , int x , int y )
	{

		topLeftX = x;
		topLeftY = y;

		drawBox( g );

	}

}
