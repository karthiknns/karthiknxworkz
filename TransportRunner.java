class TransportRunner{
 public static void main(String[] args)
 {
	 System.out.println("transport details");
	 double ref=Transport.transfer("bus","kolar");
	 System.out.println(ref);
	 return;
	 double ref1=Transport.transfer("truck","kolar",4.30f);
	 	 System.out.println(ref1);
		 
	 boolean ref3=Transport.transfer("kolar");
   System.out.println(ref3);
 }
}