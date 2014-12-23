package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/16/2014.
 */

public class Box
{

	protected int topLeftX;	// top left X coordinate of the Box position
	protected int topLeftY;	// top left y coordinate of the Box position
	protected int width;	// width of the box
	protected int height; // height of the box

	public Box()
	{
		
		topLeftX = 50;
		topLeftY = 50;
		width = 50;
		height = 25;
		
	}

	public Box( Graphics g )
	{

		topLeftX = 50;
		topLeftY = 50;
		width = 50;
		height = 25;

		drawBox(g);

	}

	public Box( Graphics g ,  int x , int y , int w , int h )
	{
		
		topLeftX = x;
		topLeftY = y;
		width = w;
		height = h;

		drawBox(g);
		
	}

	public void drawBox( Graphics g )
	{
		
		g.setColor( Color.black );

		int topLeftX2 = topLeftX + width / 3;
		int topLeftY2 = topLeftY + height / 3;

		
		//g.drawRect( topLeftX , topLeftY , width , height );
		
		g.drawRect( topLeftX2 , topLeftY2 , width , height );
		
		g.drawLine( topLeftX , topLeftY , topLeftX , topLeftY + height );
		g.drawLine( topLeftX , topLeftY , topLeftX + width , topLeftY );
		
		g.drawLine( topLeftX , topLeftY , topLeftX2 , topLeftY2 );
		g.drawLine( topLeftX + width , topLeftY , topLeftX2 + width , topLeftY2 );
		g.drawLine( topLeftX , topLeftY + height , topLeftX2 , topLeftY2 + height );
		
		//g.drawLine( topLeftX + width ,topLeftY + height , topLeftX2 + width , topLeftY2 + height );
		
	}

	public void moveBox( Graphics g , int x , int y )
	{

		topLeftX = x;
		topLeftY = y;

		drawBox( g );

	}
	
	public int getTopLeftX() { return topLeftX; }
	
	public int getTopLeftY() { return topLeftY; }
	
	public int getWidth() { return width; }
	
	public int getHeight() { return height; }
	
	public void setTopLeftX( int x ) { topLeftX = x; }
	
	public void setTopLeftY( int y ) { topLeftY = y; }
	
	public void setWidth( int w ) { width = w;}
	
	public void setHeight( int h ) { height = h; }

}
