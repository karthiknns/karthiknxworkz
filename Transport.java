class Transport{
	static double transfer(String source,String destination)
	{
		System.out.println("enter transport details");
		if(source=="bus")
		{
			System.out.println("distance from banglore is");
			return 67d;
		}
		return 0;
	}
	static double transfer(String source,String destination,float ontime)
	{
		System.out.println("print details");
		if(source=="truck" )
		{
			System.out.println("time taken from banglore to kolar" );
			return 67d;
		}
	return 0;}
	static boolean transfer(String destination)
	{
		System.out.println("distance from kolar is 67");
		return true;
	}
}
