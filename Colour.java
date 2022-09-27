class Colour{
	
	static String[] name={null,null,null,null,null,null,null};
	static int position=0;
	
	 static void save(String names)
	{
		System.out.println("method start");
		name[position]=names;
		position++;
		
		if(name!=null && names.length()>3)
		{
			System.out.println("enter names   "+names+"  enter length  "+names.length() );
			return;
		}
		else
		{
			System.out.println("enter name does not exist and length is to long");
		}
		if(position>=7)
		{
			System.out.println("enter Details");
		}
		
	}
	
	 static void displayDetails()
	{
		for(int index=0;index<name.length;index++)
		{
		String ref=name[index];
		System.out.println("names    : "+ref);
	}
	}
	
	static boolean findColour(String colour)
	{
		if(name!=null && colour.length()>3)
		{
			System.out.println("valid name");
			
		
		for(int find=0;find<name.length;find++)
		{
			String ref1=name[find];
			
			if(ref1== colour)
			{
				System.out.println("condition true");
				return true;
			}
			else
			{
				System.out.println("condition false");
			}
		
		}}return false;
	}
	
}