package net.franklinps.chivallati.GraphicsLab05;

import java.awt.*;

/**
 * Created by CompSci-04 on 12/16/2014.
 */
public class Box
{

	private Point boxCenter;
	private Point boxTopLeft;
	private Point boxTopRight;
	private Point boxBottomLeft;
	private Point boxBottomRight;
	private Point p1;
	private Point p2;
	private Point p3;

	public Box( Graphics g ) //assigns the default points to make a box
	{

		boxCenter = new Point( 0 , 0 );
		boxTopLeft = new Point( 0 , 0 );
		boxTopRight = new Point( 0 , 0 );
		boxBottomLeft = new Point( 0 , 0 );
		boxBottomRight = new Point( 0 , 0 );
		p1 = new Point( 0 , 0 );
		p2 = new Point( 0 , 0 );
		p3 = new Point( 0 , 0 );

	}

	public Box( Graphics g , Point boxCenter , int boxWidth , int boxHeight )
	{

		this.boxCenter = boxCenter;
		this.boxTopLeft = new Point( boxCenter.getX() - ( boxWidth / 2 ) , boxCenter.getY() - ( boxHeight / 2 ) );
		this.boxTopRight  = new Point( boxCenter.getX() + ( boxWidth / 2 ) , boxCenter.getY() - ( boxHeight / 2 ) );
		this.boxBottomLeft = new Point( boxCenter.getX() - ( boxWidth / 2 ) , boxCenter.getY() + ( boxHeight / 2 ) );
		this.boxBottomRight  = new Point( boxCenter.getX() + ( boxWidth / 2 ) , boxCenter.getY() + ( boxHeight / 2 ) );

		this.p1 = new Point( this.boxTopLeft.getX() - ( boxWidth / 3 ) , this.boxTopLeft.getY() - ( boxHeight / 3 ) );
		this.p2 = new Point( this.boxBottomLeft.getX() - ( boxWidth / 3 ) , this.boxBottomLeft.getY() - ( boxHeight / 3 ) );
		this.p3 = new Point( this.boxTopRight.getX() - ( boxWidth / 3 ) , this.boxTopRight.getY() - ( boxHeight / 3 ) );

	}

	public Point getBoxCenter() { return boxCenter; }

	public Point getBoxTopLeft() { return boxTopLeft; }

	public Point getBoxBottomLeft() { return boxBottomLeft; }

	public Point getBoxBottomRight() { return boxBottomRight; }

	public void drawBox( Graphics g )
	{



	}

}
