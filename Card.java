class Card{
	static String type;
	static int height;
	static int width;
	static float price;
	static String[] colour;
	static void displayDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		
		for(int ref=0;ref<colour.length;ref++)
		{
			System.out.println("colours of card");
			String ref1=colour[ref];
			System.out.println(ref1);
		}
	}
}