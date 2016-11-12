class Condition
{
	public static void main(String[] args)
	{
	//Declarations	
	int	num1,
		num2;
	String 	result;


	//Initialisations
	num1	= 1357;
	num2	= 2468;
	
	//Functions
	result	= (num1 % 2 != 0) ? " Odd ":" Even ";
	System.out.println(num1 + " is" + result);

	result	= (num2 % 2 != 0) ? " Odd ":" Even ";
	System.out.println(num2 + " is" + result);	
	

	}
	
}
