class EqualsStudntTest
{
	public static void main(String[] args)
	{
		EqualsStudnt eqs1 = new equalsStudent(1,"shiva","Cj");
		EqualsStudnt eqs2 = new equalsStudent(2,"ram","AdvCj");
		EqualsStudnt eqs3 = new equalsStudent(3,"john","oracle");
		EqualsStudnt eqs4 = eq2;
		

			System.out.println(eqs1==eq2);//false,different references
			System.out.println(eqs1.equals(eqs2));//false,differen state
			System.out.println();
					
			System.out.println(eqs1==eq2);//false ,different references	
			System.out.println(eqs1.equals(eqs3)));	//true same states -->but objects are different
				
			System.out.println(eqs2==eq4);	// true
			System.out.println(eqs2.equals(eqs4)); // true both reference variables has same object reference
		
		
			EqualsAddress eqadd = new EqualsAddress();
	}
}