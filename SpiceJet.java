class SpiceJet{
	static void flight(String[] flightNameref)
	{
		System.out.println("enter the flight names");
		System.out.println("-----"+flightNameref.length);
		
		for(int index=0;index<flightNameref.length;index++)
		{
			String ref=flightNameref[index];
			System.out.println(ref);
			flightNameref[2]="mig";
			
		}
	//return null;
	}
}