package net.franklinps.chivallati.GraphicsLab05;

/**
 * Created by CompSci-04 on 12/16/2014.
 */

public class Point
{
	int x;
	int y;

	public Point()
	{

		x = 0;
		y = 0;

	}

	public Point(int x, int y)
	{

		this.x = x;
		this.y = y;

	}

	public int getX() { return x; }
	public int getY() { return y; }

	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }

}