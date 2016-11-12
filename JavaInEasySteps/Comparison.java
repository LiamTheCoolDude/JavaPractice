
class Comparison
{
	public static void main(String[] args)
	{
		//Declaration	
		String	txt,
		       	lang;    	
		boolean state;
		int	dozen,
		  	score;  
		
			
		//Initialisation
		txt	= "Fantastic ";
		lang	= "Java";
		dozen	= 12;
		score	= 20;
		
		
		//Function equal to
		state	= (txt == lang);//Assign test result
		System.out.println("Does Java = Fantastic?");
		System.out.println("String Equality Test: " + state +"\n");
		

		//Function not equal to
		state	= (txt != lang);		//Assign result
		System.out.println("Does Java not = Fantastic?");
		System.out.println("String Inequality Test: " + state +"\n");
		

		//Function more than
		state	= (dozen > score);	//Assign result
		System.out.println("Is a dozen(12) greater than a score(20)?");
		System.out.println("Greater Than Test: " + state +"\n");



		//Function less than
		state	= (dozen < score);	//Assign result
		System.out.println("Is a dozen(12) less than a score(20)?");
		System.out.println("Less Than Test: " + state +"\n");







	
	}
	
}
