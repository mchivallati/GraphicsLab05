package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

/**
 * Created by chivy_000 on 12/23/2014.
 */
public class ChristmasTree extends Tree
{
	
	protected int treeX;
	protected int treeY;
	
	public ChristmasTree( Graphics g , int tx , int ty )
	{
		
		super( g , tx , ty );
		
		treeX = tx;
		treeY = ty;
		
		addOrnaments(g);
		
	}
	
	public void addOrnaments( Graphics g )
	{
		
		int diam = 15;
		
		for ( int i = 0 ; i < 5 ; i++ )
		{

			int x = Util.randomInt( treeX + ( ( treeX / 3 ) + ( treeX / 6 ) ) , treeX + ( treeX / 3 ) + 50 );
			int y = Util.randomInt( treeY + ( ( treeY / 3 ) + ( treeY / 2 ) ) , treeY + ( treeY / 3 ) + 75 );
			
			Util.setRandomColor(g);
			
			g.fillOval( x , y , diam , diam );
			
		}
		
	}

}
