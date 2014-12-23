package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/19/2014.
 */
public class Frame
{

	private final int frameWidth;
	private final int frameHeight;
	private final int frameX;
	private final int frameY;

	public Frame( Graphics g , int fx , int fy , int fw , int fh )
	{

		this.frameX = fx;
		this.frameY = fy;
		this.frameWidth = fw;
		this.frameHeight = fh;

		frameBorder(g);

	}

	public void frameBorder( Graphics g )
	{

			g.drawRect( frameX , frameY , frameWidth , frameHeight );

	}

}