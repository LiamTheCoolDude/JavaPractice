class Constants
{
	public static void main(String[] args)
	{
		//Declaration of constants
		final int TOUCHDOWN	= 6;
		final int CONVERSION	= 1;
		final int FIELDGOAL	= 3;


		//Declaration of variables
		int	td,
			con,
			fg,
			tdsum,
			consum,
			fgsum,
			total;


		//Initialisations of variables
		td	= 1111110000;
		con	= 1111110000;
		fg	= 1111110000;
		

		//Functions of Calculations
		tdsum	= td * TOUCHDOWN;
		consum	= con * CONVERSION;
		fgsum	= fg * FIELDGOAL;

		total	= (tdsum + consum + fgsum);

		
		//Functions of Printing
		System.out.println("This program calculates the score of an American football game");
		System.out.println(TOUCHDOWN + " points for a Touchdown");
		System.out.println(CONVERSION + " point for a Conversion");
		System.out.println(FIELDGOAL + " points for a Field Goal");
		System.out.println("In the game, " + td + " Touchdowns, " + con + " Conversions and " + fg + " field goals were scored"); 
		System.out.println("The Final Score of the Game was: " + total + " points!" );




	}
}
