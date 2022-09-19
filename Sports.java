class Sports{
	static void circketTeamMembers(String[] names)
	{
		System.out.println("playing 11--");
		System.out.println("total players"+names.length);
		for(int index=0;index<names.length;index++)
		{
			String ref=names[index];
			System.out.println(ref);
		}
	}
	static void kabbadiTeamMemberJerseyNos(int[] nos)
	{
		System.out.println(".........................");
		System.out.println("jersey no");
		System.out.println("nos"+nos.length);
		
		for(int refs=0;refs<nos.length;refs++)
		{
			int ref1=nos[refs];
			System.out.println(ref1);
		}
	}
	static void footballTeamMembersSalery(double[] salaries)
	{
		System.out.println("............................");
		System.out.println("salaries");
		System.out. println("salaries"+salaries.length);
		
		for(int refs1=0;refs1<salaries.length;refs1++)
		{
			double ref2=salaries[refs1];
          System.out.println("salary"+ref2);			
		}
	}
	static void hockeyPlayerNoOfMatchesAndMobileNo(long[] matches,long[] mobileNo)
	{
		System.out.println("..............................");
		System.out.println("1"+matches.length);
		for(int refs2=0;refs2<matches.length;refs2++)
		{
			long ref3=matches[refs2];
		System.out.println("matches"+ref3);
		}
				for(int refs4=0;refs4<mobileNo.length;refs4++)
				{
								long ref5=mobileNo[refs4];
		System.out.println("mobileNo no"+ref5);

				}
	}
}