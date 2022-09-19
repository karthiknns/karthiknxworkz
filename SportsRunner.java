class SportsRunner{
	public static void main(String[] viru)
	{
		System.out.println("player names");
		String[] names={"Virat","Rahul","Surya","D Karthik","hooda","jadeja","rahul tripati","bhuvneshwar","bumrah","chahal","Siraj"};
		Sports.circketTeamMembers(names);
		
		int[] nos={7,9,1,17,18,99,44};
		Sports.kabbadiTeamMemberJerseyNos(nos);
		
		double[] salaries={25000d,20000d,30000d,24000d,31000d,50000d,60000d,55000d,15000d,5000d};
		Sports.footballTeamMembersSalery(salaries);
		
		long[] matches={45,25,23,56,89,24,10,105};
		long[] mobileNo={6362060352l,9420079950l,9482535221l,9686845654l,9480056457l,9900665467l};

		Sports.hockeyPlayerNoOfMatchesAndMobileNo(matches,mobileNo);
		
		
	}