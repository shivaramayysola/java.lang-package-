class IdentityHashCodeTest
{
	public static void main(String[] args)
	{
		ExampleIdentity e1 = new ExampleIdentity(5);
		ExampleIdentity e2  = new ExampleIdentity(5);
		ExampleIdentity e3 = new ExampleIdentity(6);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
		
		System.out.println(e1.JVMHC());
		System.out.println(e2.JVMHC());
		System.out.println(e3.JVMHC());
	}
}