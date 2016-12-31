class Else
{
	public static void main(String[] args)
	{
		//Declarations
		int	hrs;
	
		//Initialisations
		hrs	= 13; 
	
		//Functions
		if(hrs<13)
		{
			System.out.println("Good Morning:" + hrs);
		}
		else if(hrs<18)
		{
			System.out.println("Good Afternoon:" + hrs);
		}
		else 	
			System.out.println("Good Evening:" + hrs);

	}
}
