package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/23/2014.
 */
public class TreeLeaves
{

	protected int leavesTopX;
	protected int leavesTopY;
	protected int leavesLeftX;
	protected int leavesLeftY;
	protected int leavesRightX;
	protected int leavesRightY;

	public TreeLeaves( Graphics g , int ltx , int lty , int llx , int lly , int lrx , int lry )
	{

		leavesTopX = ltx;
		leavesTopY = lty;
		leavesLeftX = llx;
		leavesLeftY = lly;
		leavesRightX = lrx;
		leavesRightY = lry;

		g.setColor( new Color( 24 , 55 , 31 ) );

		g.fillPolygon( Util.tri( leavesTopX, leavesTopY, leavesLeftX, leavesLeftY, leavesRightX, leavesRightY ) );

	}
	
}
