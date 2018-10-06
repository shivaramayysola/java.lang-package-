class HashCodeCustomDemo
{
	public static void main(String[] args)
	{
		ExampleCustomObj e1 = new ExampleCustomObj();
		ExampleCustomObj e2 = new ExampleCustomObj();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}