class FoodItemsData{
	
	static String[] name={null,null,null,null};
	static int[] price={0,0,0,0};
	
	static int position=0;
	
	static void save(String names,int prices)
	{
		name[position]=names;
		price[position]=prices;
		position++;
	}
	
	static void displayDetails()
	{
		for(int index=0;index<name.length;index++)
		{
			
			String ref=name[index];
			int ref1=price[index];
			
			System.out.println("name : "+ref+"  price : "+ref1+"position    "+index);
		}
	}
}