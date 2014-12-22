package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/19/2014.
 */
class Frame
{

	private final int frameWidth;
	private final int frameHeight;
	private final int frameX;
	private final int frameY;

	public Frame( int fw , int fh , int fx , int fy )
	{

		this.frameWidth = fw;
		this.frameHeight = fh;
		this.frameX = fx;
		this.frameY = fy;

	}

	public void frameBorder( Graphics g )
	{

		for ( int x = 0 ; x < 4 ; x++ )
		{

			Util.setRandomGrayscale( g , 100 , 255 );

			g.drawRect( frameX - x, frameY - x, frameWidth - x, frameHeight - x );

		}

	}

}
