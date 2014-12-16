package net.franklinps.chivallati;

import java.awt.*;

public class Util
{


	//---------- Random Color Methods ----------//

	public static void setRandomColor( Graphics g )
	{

		int red = randomInt( 0, 255 ); // generates the random value between the min and max value that were passed into the formal param

		int green = randomInt( 0, 255 ); // generates the random value between the min and max value that were passed into the formal param

		int blue = randomInt( 0, 255 ); // generates the random value between the min and max value that were passed into the formal param


		g.setColor( new Color( red, green, blue ) ); //creates and sets the color to a random color

	}


	public static void setColorRandomAlpha( Graphics g, int red, int green, int blue, int minAlpha, int maxAlpha ) //creates and sets the color to a random shade of a color with the specified red, green, and blue value in the actual param ***NONE OF THE PARAMS CAN BE > 256***
	{

		int range = maxAlpha - minAlpha; //used to control the maximum value the random method outputs

		int alpha = (int) ( ( Math.random( ) * range ) + minAlpha ); // generates the random value between the min and max value that were passed into the formal param


		g.setColor( new Color( red, green, blue, alpha ) ); //creates and sets the color to a random shade of a color with the specified red, green, and blue value in the actual param

	}


	public static void setRandomGrayscale( Graphics g, int minAlpha, int maxAlpha ) //Creates and sets the color to a random shade of gray ***NONE OF THE PARAMS CAN BE > 256***
	{

		int range = maxAlpha - minAlpha;  //used to control the maximum value the random method outputs

		int a = (int) ( ( Math.random( ) * range ) + minAlpha ); // generates the random value between the min and max value that were passed into the formal param


		g.setColor( new Color( 0, 0, 0, a ) ); //creates and sets the color to a random shade of gray

	}


	public static void setRandomWhiteShades( Graphics g, int minAlpha, int maxAlpha ) // Creates and sets a random shade/transparency of white by manipulating the alpha value of a color ***NONE OF THE PARAMS CAN BE > 256***
	{

		int range = maxAlpha - minAlpha; //used to control the maximum value the random method outputs

		int a = (int) ( ( Math.random( ) * range ) + minAlpha ); // generates the random value between the min and max value that were passed into the formal param


		g.setColor( new Color( 255, 255, 255, a ) ); //creates and sets the color to the random shade/transparency of white

	}


	//---------- Random Number Methods ---------//


	public static int randomInt( int min, int max ) //generates a random number
	{

		int range = max - min; //used to control the maximum value the random method outputs

		int randomNum = (int) ( ( Math.random( ) * range ) + min ); // generates the random value between the min and max value that were passed into the formal param

		return randomNum; //returns the value generated to randomNum( int min , int max )

	}


	//---------- Quadrilateral Polygon Method ----------// *must be used with a g.drawPolygon(); statement*


	public static Polygon quad( int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4 )
	{

		int x[] = { x1 , x2 , x3 , x4 }; //an array for the 4 x coords of the 4 points of the quad

		int y[] = { y1 , y2 , y3 , y4 }; //an array for the 4 y coords of the 4 points of the quad

		Polygon quad = new Polygon( x, y, 4 ); //creates the quad using the


		return quad; //returns the new quad to where the it was called in a g.drawPolygon(); statement

	}


	//---------- Trianlge Polygon Method ----------// *must be used with a g.drawPolygon(); statement*


	public static Polygon tri( int x1, int y1, int x2, int y2, int x3, int y3 )
	{

		int x[] = { x1 , x2 , x3 };

		int y[] = { y1 , y2 , y3 };

		Polygon tri = new Polygon( x, y, 3 );

		return tri;

	}


	//---------- Pentagon Method ----------// *must be used with a g.drawPolygon(); statement*

	public static Polygon penta( int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5 )
	{

		int x[] = { x1 , x2 , x3 , x4 , x5 };

		int y[] = { y1 , y2 , y3 , y4 , y5 };

		Polygon penta = new Polygon( x, y, 5 );


		return penta;

	}


	//---------- Skip Line or Enter Method ----------//


	public static void skip( int n )
	{

		for ( int j = 1 ; j <= n ; j++ )
			System.out.println( );

	}


	//--------- Align-Right Method ----------//


	public static void rightJustify( String text )
	{

		int len = text.length( );

		int numSpaces = 80 - len;


		for ( int j = 1 ; j <= numSpaces ; j++ )
			System.out.print( " " );


		System.out.println( text );

	}


	//---------- Align-Center Method ----------//


	public static void center( String text )
	{

		int len = text.length( );

		int numSpaces = ( 80 - len ) / 2;


		for ( int j = 1 ; j <= numSpaces ; j++ )
			System.out.print( " " );


		System.out.println( text );

	}


}