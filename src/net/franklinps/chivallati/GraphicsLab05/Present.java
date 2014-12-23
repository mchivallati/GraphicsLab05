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

			case 1 : redLineWrapping(g); break;
			case 2 : greenLineWrapping(g); break;
			default : System.out.println( "Your type of wrapping does not exist. HINT: Wrapping types are 1 - 3" );

		}

	}

	public void greenLineWrapping( Graphics g )
	{

		int i = presentY + presentHeight / 3;

		Util.setColorRandomAlpha( g , 0 , 255 , 0 , 175 , 225 );

			g.fillRect( presentX + presentWidth / 3 , i , presentWidth , presentHeight / 4 );

		Util.setColorRandomAlpha( g, 0, 255, 0, 150, 225 );

			g.fillPolygon( Util.quad( presentX ,
							presentY ,

							( presentX + presentWidth / 3 ),
							i ,

							( presentX + presentWidth / 3 ),
							( i + presentHeight / 3 ),

							presentX,
							( presentY + presentHeight / 3 )
					)
			);



		Util.setColorRandomAlpha( g , 0 , 255 , 0 , 50 , 125 );

		g.fillPolygon( Util.quad( presentX ,
						presentY ,

						presentX + presentWidth ,
						presentY ,

						( presentX + presentWidth / 3 ) + presentWidth ,
						( presentY + presentHeight / 3 ) ,

						presentX + presentWidth / 3 ,
						presentY + presentHeight / 3
				)
		);

	}

	public void redLineWrapping( Graphics g )
	{

		int i = presentY + presentHeight / 3;
		

			Util.setColorRandomAlpha( g, 255, 0, 0, 150, 225 );

				g.fillRect( presentX + presentWidth / 3, i, presentWidth, presentHeight / 4 );

			Util.setColorRandomAlpha( g, 255, 0, 0, 150, 225 );

				g.fillPolygon( Util.quad( presentX,
			                          presentY,

			                          ( presentX + presentWidth / 3 ),
			                          i,

			                          ( presentX + presentWidth / 3 ),
			                          ( i + presentHeight / 3 ),

			                          presentX,
			                          ( presentY + presentHeight / 3 )
			               )
			);


			Util.setColorRandomAlpha( g, 255, 0, 0, 50, 125 );

			g.fillPolygon( Util.quad( presentX,
			                          presentY,

			                          presentX + presentWidth,
			                          presentY,

			                          ( presentX + presentWidth / 3 ) + presentWidth,
			                          ( presentY + presentHeight / 3 ),

			                          presentX + presentWidth / 3,
			                          presentY + presentHeight / 3
			               )
			);


	}

}