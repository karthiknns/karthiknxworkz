class MovieDataOperater
{
	static String[] names={null,null,null,null};
	static int[] collection={0,0,0,0};
	
	static int position=0;
	
	static void save(String name,int rs)
	{
		names[position]=name;
		collection[position]=rs;
		position++;
	}
	static void displayDetails()
	{
		for(int index=0;index<names.length;index++)
		{
			String ref=names[index];
			int ref1=collection[index];
			
			System.out.println("movie name : "+ref+" collection rs : "+ref1+"position"+index);
		}
	}
}