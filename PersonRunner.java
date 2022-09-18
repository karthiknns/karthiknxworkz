class PersonRunner
{
	public static void main(String[] args)
	{
		System.out.println("person details");
		String ref=Person.work("TCS",45000d);
		System.out.println(ref);
		
		int ref1=Person.work("TCS",45000d,"gm");
		System.out.println(ref1);
	}
}