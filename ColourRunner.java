class ColourRunner{
	
	public static void main(String[] args)
	
	{
		
		System.out.println("main start");
		
		Colour.save("green");
		Colour.save("blue");
		Colour.save("red");
		Colour.save("orange");
		Colour.save("sky blue");
		Colour.save("yellow");
		Colour.save("white");
		
		Colour.displayDetails();
		
		boolean ref=Colour.findColour("orange");
				System.out.println(" colour is: "+ref);

		System.out.println("main end");
		

		
		
	}
}