package Common;

import java.sql.Date;

public class Member
{
	private String memberno;
	private String name;
	private String family;
	private String address;
	private String phone;
	private int age;
	private Date memdate;
	
	
	
	@Override
	public String toString()
	{
		return "Member [memberno=" + memberno + ", name=" + name + ", family="
				+ family + ", address=" + address + ", phone=" + phone
				+ ", age=" + age + ", memdate=" + memdate + "]";
	}
	
	
	public String getMemberNO()
	{
		return memberno;
	}
	
	public void setMemberNO(String memberno)
	{
		this.memberno = memberno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getFamily()
	{
		return family;
	}
	
	public void setFamily(String family)
	{
		this.family = family;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public Date getMemdate()
	{
		return memdate;
	}
	
	public void setMemdate(Date memdate)
	{
		this.memdate = memdate;
	}
	
	
	
}
