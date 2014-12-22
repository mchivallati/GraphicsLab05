package net.franklinps.chivallati.GraphicsLab05;

import net.franklinps.chivallati.Util;

import java.awt.*;

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
	
	public Present( Graphics g , int presentX , int presentY , int presentWidth , int presentHeight , int wrappingSelector )
	{
		
		super( g , presentX , presentY , presentWidth , presentHeight );

		this.presentX = presentX;
		this.presentY = presentY;
		this.presentWidth = presentWidth;
		this.presentHeight = presentHeight;

		addWrapping( g , wrappingSelector );

	}

	public void addWrapping( Graphics g , int selector )
	{

		switch (selector)
		{

			case 1 : horizLineWrapping(g);

		}

	}

	public void dotWrapping( Graphics g )
	{



	}

	public void vertLineWrapping( Graphics g )
	{



	}

	public void horizLineWrapping( Graphics g )
	{

		Util.setRandomGrayscale( g , 0 , 50 );

		g.fillRect( presentX + presentWidth / 3 , presentY + presentHeight / 3 , presentWidth , presentHeight );

		for ( int i = presentY + presentHeight / 3 ; i <= presentHeight + presentY ; i += presentHeight / 2 )
		{

			Util.setColorRandomAlpha( g , 255 , 0 , 0 , 150 , 225 );

			g.fillRect( presentX + presentWidth / 3 , i , presentWidth , presentHeight / 4 );

		}

		Util.setColorRandomAlpha( g , 0 , 255 , 0 , 150 , 225 );
		
		g.fillPolygon( Util.quad( presentX ,
		                          presentY ,
		                          
		                          ( presentX + presentWidth / 3 ) ,
		                          presentY + presentHeight / 3 ,
		                          
		                          ( presentX + presentWidth / 3 ) ,
		                          ( presentY + presentHeight / 3 ) + presentHeight ,
		                          
		                          presentX,
		                          presentY + presentHeight ) );

	}

}