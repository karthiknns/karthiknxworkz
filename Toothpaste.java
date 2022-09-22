class Toothpaste{
	static String brand;
	static int price;
	static String colourOfBody;
	static boolean cooling;
	static float weight;
	static char size;
	static int length;
	static double width;
	static boolean saltContent;
	static boolean instanceCooling;
	static int radiusOfWhole;
	static int water;
	static boolean solid;
    static double density=1.499d;
     static double molarMass=289.54d; 	
	 
	  static void setBrand(String ref)
	  {
		  brand=ref;
	  }
	  static String getBrand()
	  {
		  System.out.println("brand="+brand);
		  return brand;
	  }
//  
	  static void setPrice(int ref)
	  {
		  price=ref;
	  }
	  static int getPrice()
	  {
		  System.out.println("price"+price);
		  return price; 
	  }
//
	  static void setColourOfBody(String ref)
	  {
		  colourOfBody=ref;
	  }
	  static String getColourOfBody()
	  {
		  System.out.println("colourOfBody"+colourOfBody);
		  return colourOfBody;
	  }
//
      static void setCooling(boolean ref)
	  {
		  cooling=ref;
	  }
	  static boolean isCooling()
	  {
		  System.out.println("cooling"+cooling);
		  return instanceCooling;
	  }	  
//
      static void setWeight(float ref)
	  {
		  weight=ref;
	  }
	  static float getWeight()
	  {
		  System.out.println("weight"+weight);
		  return weight;
	  }
//
     static void setSize(char ref)
	 {
		 size=ref;
	 }
	 static char getSize()
	 {
		 System.out.println("size"+size);
		 return size;
	 }
//
	static void setLength(int ref)
    {
		length=ref;
	}	
	static int getlength()
	{
		System.out.println("length"+length);
		return length;
	}
//
   static void setWidth(double ref)
   {
	   width=ref;
   }
   static double getWidth()
   {
	   System.out.println("width"+width);
	   return width;
   }
 //
    static void setSaltContent(boolean ref)
	{
		saltContent=ref;
	}	
	static boolean istSaltContent()
	{
		System.out.println("saltContent"+saltContent);
		return saltContent;
	}
//
	static void setInstanceCooling(boolean ref)
	{
		instanceCooling=ref;
	}
	static boolean isInstanceCooling()
	{
		System.out.println("isInstanceCooling"+instanceCooling);
		return instanceCooling;
	}
//
     static void setRadiusOfWhole(int ref)
	 {
		 radiusOfWhole=ref;
	 }
	 static int getRadiusOfWhole()
	 {
		 System.out.println("radiusOfWhole"+radiusOfWhole);
		 return radiusOfWhole;
	 }
//
     static void setWater(int ref)
	 {
		 water=ref;
	 }
	 static int getWater()
	 {
		 System.out.println("water"+water);
		 return water;
	 }
//
     static void setSolid(boolean ref)
	 {
		 solid=ref;
	 }
	 static boolean getsolid()
	 {
		 System.out.println("solid"+solid);
		 return solid;
	 }
//
      static void setDensity(double ref)
	  {
		  density=ref;
	  }
	  static double getDensity()
	  {
		  System.out.println("density"+density);
		  return density;
	  }
//
	 static void setMolarMass(double ref)
	 {
		 molarMass=ref;
	 }
	 static double getMolarMass()
	 {
		 System.out.println("molarMass"+molarMass);
		 return molarMass;
	 }
}