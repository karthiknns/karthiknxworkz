class Person{
	static String work(String company,double salary) 
	{
		System.out.println("enter person details");
		
		if(company=="TCS" &&salary==45000d)
		{
			System.out.println("enter the name of person");
			return "dharshan";
		}
		return null;
	}
	static int work(String company,double salary,String designation)
	{
		System.out.println("enter details");
		if(company=="TCS"&&salary==45000d&&designation=="gm")
		{
			System.out.println("enter id");
			return 8;
		}
	return 0;}
}