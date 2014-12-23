package net.franklinps.chivallati.GraphicsLab05;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/23/2014.
 */
public class TreeTrunk
{
	
	protected int trunkX;
	protected int trunkY;
	protected int trunkWidth;
	protected int trunkHeight;
	
	public TreeTrunk( Graphics g , int tx , int ty , int tw , int th )
	{

		trunkX = tx;
		trunkY = ty;
		trunkWidth = tw;
		trunkHeight = th;
		
		g.setColor( new Color( 43 , 30 , 23 ) );

			g.fillRect( trunkX , trunkY , trunkWidth ,trunkHeight );
		
	}
	
}