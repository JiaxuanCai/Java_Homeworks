package model;

public class Record 
{
	private String name;
	private String gender;
	private String number;
	
	public Record(String n, String g, String num)
	{
		name=n;
		gender=g;
		number=num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getNum()
	{
		return number;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void setGender(String g)
	{
		gender=g;
	}
	
	public void setNum(String num)
	{
		number=num;
	}

	public int hashCode()//override hashCode method
	{
		return name.hashCode()+gender.hashCode()+number.hashCode();
	}
	
	public boolean equals(Object o)//override equals
	{
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record r = (Record) o;
        return name == r.name &&gender==r.gender&&number==r.number;
	}
	
	public String out()
	{
		String temp=name+" "+gender+" "+number+"\n";
		return temp;
	}
}
