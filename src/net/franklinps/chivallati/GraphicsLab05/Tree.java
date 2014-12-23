package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/23/2014.
 */
public class Tree
{
	
	private int treeX;
	private int treeY;
	
	public Tree() {}

	public Tree( Graphics g , int tx , int ty )
	{
		
		treeX = tx;
		treeY = ty;
		
		new TreeTrunk( g , treeX + 40 , treeY + 125 , 20 , 50 );
		
		new TreeLeaves( g , treeX + 50 , treeY , treeX , treeY + 125 , treeX + 100 , treeY + 125 );
		
	}

}
