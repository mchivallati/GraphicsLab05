package net.franklinps.chivallati.GraphicsLab05;

/**
 * Created by CompSci-04 on 12/16/2014.
 */
public class Box extends Point
{

	private Point boxCenter;
	private Point boxTopLeft;
	private Point boxTopRight;
	private Point boxBottomLeft;
	private Point boxBottomRight;

	public Box() //assigns the default points to make a box
	{



	}

	public Box( Point boxCenter , int boxWidth , int boxHeight )
	{

		this.boxCenter = boxCenter;
		//assign values to all atributes

	}

}
