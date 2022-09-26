class PoliticanDataOperater{
	
	static String[] name={null,null,null,null};
	static int[] age={0,0,0,0};
	
	static int position=0;
	
	static void save(String names,int ages)
	{
		name[position]=names;
		age[position]=ages;
		position++;
	}
	
	static void displayDetails()
	{
		for(int index=0;index<name.length;index++)
		{
			String ref=name[index];
			int ref1=age[index];
			
			System.out.println("names :"+ref+"  age : "+ref1+"  position : "+index);
			
		}
	}
}