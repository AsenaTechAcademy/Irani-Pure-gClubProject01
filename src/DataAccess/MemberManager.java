package DataAccess;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MemberManager
{
	public static void Insert(Common.Member objMember)
	{
		try
		{
			PreparedStatement r = DBConnector.getConnection().prepareStatement(
					"insert into member(mno,name,family,address,phone,memdate,age)"
							+ "values (?,?,?,?,?,?,?);");
			r.setString(1, objMember.getMemberNO());
			r.setString(2, objMember.getName());
			r.setString(3, objMember.getFamily());
			r.setString(4, objMember.getAddress());
			r.setString(5, objMember.getPhone());
			r.setDate(6, objMember.getMemdate());
			r.setInt(7, objMember.getAge());
			
			r.execute();
			
			//System.out.println("Inserted");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}// End of Insert
	
	
	
}
