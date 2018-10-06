class EqualsTest
{
	public static void main(String[] args)
	{
		EqualsExample eq1 = new EqualsExample();
		EqualsExample eq2 = new EqualsExample();
		EqualsExample eq3 = eq2;
		
		System.out.println(eq1==eq2);
		System.out.println(eq2==eq3);
	}
}