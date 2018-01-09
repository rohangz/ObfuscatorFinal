import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Obfuscate001  {
	public static final String file="F:\\Tester\\Unobfuscatedcodes\\Sample.java";
	private static RegTester myReg;
	private static DeadCodeGenerator dc;
	private static SimpleStringObfuscator sob;
	
/*	public static int mainfinder(String s)
	{
	//	Pattern p=Pattern.compile(regex);
//Matcher m=p.matcher(s);
		
		return -1;
	}*/
	public static String removeSpaces(String s)
	{
		String res="";
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i)==9)
				i++;
			else if(s.charAt(i)!=' ')
			{
				res=res+s.charAt(i);
				i++;
			}	
			else
			{
				int j=i+1;
				res=res+s.charAt(i);
				while(j<s.length() && s.charAt(j)==' ')
					j++;
				i=j;
			}
			
		}
		
		return res;
	}
	public static void  main(String []args)
	{
		BufferedReader br=null;
		FileReader fr=null;
		sob=null;
		try
		{
			sob=new SimpleStringObfuscator();
			dc=new DeadCodeGenerator();
			dc.initCodes();
			dc.generateDeadCount();
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			String line="";
			String fullcode="";
			int deadCount=0;
			
			myReg=new RegTester();
			
			/*while((line=br.readLine())!=null)
			{
				
				fullcode=fullcode+line;
				//System.out.print(line);
			}*/
			
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				myReg.setgiven(line);
				int isMethodPresent=myReg.methodDetector(line);
				if(isMethodPresent==1)
				{
					int index=line.indexOf('{');
					System.out.println(index+"{ index ");
					if(index!=-1)
					{
						System.out.println("sub string line");
						String sub=line.substring(0,index+1);
						System.out.println("No error with substring ");
						
						deadCount=dc.returnDeadCount();
						List<String> deadCodeConditions=dc.returnDeadCodeConditions();
						System.out.println("No error with conditions ");
						List<String> deadCodeGenerated=dc.returnDeadCodes();
					//	fullcode=fullcode+sub;
						
						int i=0;
						while(i<deadCount)
						{
						//	fullcode=fullcode+deadCodeConditions.get(i);
						//	fullcode=fullcode+"{}else{";
							//System.out.println("Deadodeconditins ==2 pre");
					//		System.out.println(deadCodeConditions.size());
							sub=sub+deadCodeConditions.get(i);
		//					System.out.println("Deadodeconditins ==2 prO");
							sub=sub+"{"+deadCodeGenerated.get((i+2)%5)+ "}else{";
							
//							sub=sub+"{}else{";
							i=(i+1)%4;
						}
						//if(index+1<line.length())
						//	sub=sub+line.substring(index+1,line.length());
						line=sub;
					
					}
			
				}
				fullcode=fullcode+line;
				//System.out.print(line);
				System.out.println("Loop ended ");
			}
			fullcode=removeSpaces(fullcode);
			while(deadCount>0)
			{
				deadCount--;
				fullcode=fullcode+"}";
			}
			System.out.println(fullcode);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(br!=null)
					br.close();
				if(fr!=null)
					fr.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


