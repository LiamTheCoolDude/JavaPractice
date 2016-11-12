class Logic
{
	public static void main(String[] args)
	{
			
		//Declaration
		boolean	yes,
			no;
		
		
		//Initialisation	
		yes	= true;
		no	= false;


		//Function && Ready for Park
		System.out.println("If both Michael and Liam are ready for the Park?");
		System.out.println("Both YesYes (Ready && Ready) True: " + (yes && yes) +"\n");
		System.out.println("If Michael is ready and Liam is not ready for the Park");
		System.out.println("Both YesNo (Ready && Not Ready) True: " + (yes && no)+"\n");

		//Function || Eat the Pizza
		System.out.println("If Michael OR || Liam want to eat the Pizza");
		System.out.println("Either YesYes True: " + (yes||yes));
		System.out.println("Either YesNo True: " + (yes||no));
		System.out.println("Either NoNo True: " + (no||no)+"\n");

		//Function ! Not Like To
		System.out.println("Would you like to?");
		System.out.println("Original Yes Value: " + yes);
		System.out.println("Inverse Yes Value: " + !yes);
			
		}
	
}	
	
	
	
	
	
	
	
	
	
	
