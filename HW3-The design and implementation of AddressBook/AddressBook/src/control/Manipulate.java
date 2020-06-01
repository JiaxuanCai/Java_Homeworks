package control;

import model.*;
import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Manipulate 
{
	static HashSet<Record> set;
	
	public Manipulate()
	{
		set=new HashSet<>();
	}
	
	public void read() throws IOException
	{
		File f=new File("data/record.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String tsize=br.readLine();
		int size=Integer.parseInt(tsize);
		for(int i=0;i<size;i++)
		{
			String trecord=br.readLine();
			StringTokenizer st=new StringTokenizer(trecord);
			String tname=st.nextToken();
			String tgender=st.nextToken();
			String tnumber=st.nextToken();
			
			Record tre=new Record(tname,tgender,tnumber);
			set.add(tre);
		}
		fr.close();
		br.close();
	}
	
	public void query() throws IOException
	{
		File f1=new File("data/query.txt");
		File f2=new File("data/result.txt");
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		BufferedReader br=new BufferedReader(fr);
		
		String temp=br.readLine();
		StringTokenizer st=new StringTokenizer(temp);
		
		String ind=st.nextToken();
		String cont=st.nextToken();

		if(ind.equals("1")) 
		{
			for(Record rc:set)
			{
				if(rc.getName().equals(cont))
				{
					fw.write(rc.out());
				}
			}
		}
		
		if(ind.equals("2"))
		{
			for(Record rc:set)
			{
				if(rc.getGender().equals(cont))
				{
					fw.write(rc.out());
				}
			}
		}
		
		if(ind.equals("3"))
		{
			for(Record rc:set)
			{
				if(rc.getNum().equals(cont))
				{
					fw.write(rc.out());
				}
			}
		}
		
		fw.flush();
		fw.close();
		fr.close();
		br.close();
	}
}