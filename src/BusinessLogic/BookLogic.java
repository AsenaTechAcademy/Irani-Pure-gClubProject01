package BusinessLogic;

import DataAccess.MemberManager;

public class BookLogic
{
	
	public void AddMember(Common.Member m)
	{
		// Check Semantic Error
		
		
		
		// if all of them done, Register it into Database
		MemberManager.Insert(m);
	}
	
	
}
