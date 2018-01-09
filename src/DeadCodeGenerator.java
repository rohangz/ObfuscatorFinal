import java.util.*;
import java.util.Random.*;
import java.io.*;
public class DeadCodeGenerator {
	private int deadCount=0;
	private Random rand;
	private List<String>  deadCodeConditions;
	private List<String> deadCodes;
	public DeadCodeGenerator()
	{
		rand=new Random();
		deadCount=5;
		deadCodes=new ArrayList<String>();
		deadCodeConditions=new ArrayList<String>();
		
	}
	public void dispCodes()
	{
		System.out.println("DeadCodesConditions========");
		for(int i=0;i<this.deadCodeConditions.size();i++)
			System.out.println(this.deadCodeConditions.get(i));
		System.out.println("DeadCodes=========");
		for(int i=0;i<this.deadCodes.size();i++)
			System.out.println(this.deadCodes.get(i));
	}
	public void initCodes()
	{
		FileReader fr1=null;
		FileReader fr2=null;
		BufferedReader b1=null;
		BufferedReader b2=null;
		try
		{
			fr1=new FileReader("F:\\Tester\\OpaquePredicateCodes\\DeadCodeConditions.txt");
			fr2=new FileReader("F:\\Tester\\OpaquePredicateCodes\\DeadCodes.txt");
			b1=new BufferedReader(fr1);
			b2=new BufferedReader(fr2);
			String line="";
			while((line=b1.readLine())!=null)
				this.deadCodeConditions.add(line);
			line="";
			while((line=b2.readLine())!=null)
				this.deadCodes.add(line);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(b1!=null)
					b1.close();
				if(b2!=null)
					b2.close();
				if(fr1!=null)
					fr1.close();
				if(fr2!=null)
					fr2.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	public List<String> returnDeadCodeConditions()
	{
		return this.deadCodeConditions;
	}
	public List<String> returnDeadCodes()
	{
		return this.deadCodes;
	}
	public int returnDeadCount()
	{	
		return deadCount;
	}
	public void generateDeadCount()
	{
		
		rand=new Random();
		deadCount=rand.nextInt(4)+1;
	}
	public static void main(String []args)
	{
		DeadCodeGenerator dc=new DeadCodeGenerator();
		int j=10;
		while(j>0)
		{
			dc.generateDeadCount();
			System.out.println(dc.returnDeadCount());
			j--;
		}
		dc.initCodes();
		dc.dispCodes();
	}

}
