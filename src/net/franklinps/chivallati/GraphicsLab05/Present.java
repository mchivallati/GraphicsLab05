package net.franklinps.chivallati.GraphicsLab05;

/**
 * Created by CompSci-04 on 12/16/2014.
 */
public class Present extends Box
{
	
	protected int presentWidth;
	protected int presentHeight;
	protected int presentX;
	protected int presentY;
	
	public Present()
	{
		
		super();
		
	}
	
	public Present( int presentX , int presentY , int presentWidth , int presentHeight )
	{
		
		super( presentX , presentY , presentWidth , presentHeight );

		this.presentX = presentX;
		this.presentY = presentY;
		this.presentWidth = presentWidth;
		this.presentHeight = presentHeight;
		
	}
	
}
