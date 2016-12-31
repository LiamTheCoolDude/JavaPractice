class If
  {
    public static void main(String[] args)
    {
      //Declarations
      int       num;      
      
      //Initialisations
      num       = 8;
      //Functions
      if (5>1)
        System.out.println("Five is greater than one");
      if (2<4)
      {
        System.out.println("Two is less than four");
        System.out.println("Test succeeded");
      }
      if (((num > 5)&&(num < 10))||(num == 12))
        System.out.println("Number is 6-9 inclusive, or 12");
      
    }
  }

