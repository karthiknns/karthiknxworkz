class TempleDataOperater{
	
	static String[] templeName={null,null,null,null,null};
	static int position=0;
	
	static void save(String templeNames)
	{
		templeName[position]=templeNames;
		System.out.println(templeNames+"    position   "+position);
		position++;
	}
	static void displayDetails()
	{
		for(int index=0;index<templeName.length;index++)
		{
			String ref=templeName[index];
			System.out.println(ref);
		}
	}
}

