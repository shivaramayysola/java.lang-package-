class HashCodeDemo
{
	public static void main(String[] args)
	{
		ExampleObj e1 = new ExampleObj();
		ExampleObj e2 = new ExampleObj();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}