public class EqualsStudent 
{
	private int sno;
	private String sname;
	private String course;
	// defining constructor to initialise object with uaer goven values
	public EqualsStudent(int sno,String sname,String course)
	{
			this.sno = sno;
			this.sname = sname;
			this.course = course;
	}
	// overriding equals() method
	public boolean equals(Object obj)
	{
	/** Comparing both onjects reference,if references in variables are same return true,
		because same object is passed,else compares state
	*/
	
		if(this==obj)
		{
			return true;
			
		}
	/**	Checking passed object IS-A EqualsStudent or not, and casting passed object to EqualsStudent for
		accessing variables of EqualsStudent class
	*/
		else
		{
			if(obj instanceof EqualsStudent)
			{
				EqualsStudent eqs = (EqualsStudent)obj;
				
				/**Comparing state of  current object and passed object*/
				return (this.sno==eqs.sno)&&
						this.sname.equals(eqs.sname)&&
						this.course.equals(eqs.course);
			}
			else
			{
					/** As per equlas method contract,
					returning false if objects arre incompatible */
						return false;
			}
		}
	}
}