class FoodItemsDataRunner{
	
	public static void main(String[] args)
	{
	 FoodItemsData.displayDetails();
		
		FoodItemsData.save("idly",35);
           		FoodItemsData.save("poori",40);
        		FoodItemsData.save("dosa",60);
             		FoodItemsData.save("lemon rice",45);
		
	FoodItemsData.displayDetails();
	}
}