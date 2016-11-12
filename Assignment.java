class Assignment
{
	public static void main(String[] args)
	
	{

	//Declaration
	String 	txt,
		lang;
	int sum,
	    num,
	 factor;     
	

	//Initalisation
	txt	= "Fantastic";
	lang	= "Java";
	txt	+= lang; //Assign concatenated String
        sum	= 10; 
	num	= 20;
	sum	+= num; //Assign result(10 + 20 = 30)
	factor	= 5;




	//Function
	System.out.println("Add & Assign String: " + txt);
	System.out.println("Add & Assign Integers:" + sum);
	sum	*= factor; //Assign result(30 x 5 = 150)
	System.out.println("Multiplicaition sum:" + sum);
	sum	/= factor; //Assign result(150 ÷ 5 = 30)

	System.out.println("Division sum: " + sum);






	}

}
