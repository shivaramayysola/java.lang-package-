class ExampleIdentity
{
	private int x;
	ExampleIdentity(int x)
	{
		this.x = x;
		
	}
	@Override
	public int hashCode()
	{
		return x;
	}
	public int JVMHC()
	{
		return super.hashCode();
	}
}