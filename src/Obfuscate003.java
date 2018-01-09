import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Obfuscate003 {
	
	
	private static FileReader fr;
	private static BufferedReader br;
	private static String filePath="F:\\Tester\\Unobfuscatedcodes\\MyProgram.java";
	private static RegTester myreg;
	private static SimpleStringObfuscator stringObfuscate;
	private static DeadCodeGenerator dc;
	private static CodeEncryptor encryptor;
	private static SimpleStringObfuscator sob;
	
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
	
	
	public static void main(String []args) throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(is);
	//	System.out.print("Enter location of class to be Obfuscated");
	//	String classPath=new String(b.readLine());
		try
		{
			myreg=new RegTester();
			dc=new DeadCodeGenerator();
			dc.initCodes();
			//dc.dispCodes();
			fr=new FileReader(filePath);
			br=new BufferedReader(fr);
			String line=new String("");
			String fullCode=new String("");
			String alpha=new String("");
			List<String> deadCodes=dc.returnDeadCodes();
			List<String> deadCodeConditions=dc.returnDeadCodeConditions();
			String sub=new String("");
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				if(line.contains("//end"))
				{
					//System.out.println("End found ");
					line=new String("}");
					int k=deadCodes.size();
					while(k>0)
					{
						line=line+"}";
						k--;
					}
					System.out.println("new line=="+line);
					//System.out.println("line == "+line);
				}
				int isSpecifierPresent=myreg.methodDetector(line);
				if(isSpecifierPresent==1)
				{
					int braceIndex=line.indexOf('{');
					String sub2=new String("");
					if(braceIndex!=-1)
					{
						//sub=sub+line.substring(0,braceIndex+1);
						//System.out.println(line.substring(braceIndex+1, line.length()));
						int i=0;
						while(i<deadCodes.size())
						{
							line=line+deadCodeConditions.get(i);
							line=line+"{"+deadCodes.get(i)+"}else{";
							i++;
						}
					}

				}
				
				fullCode=fullCode+line;
			}
			int k=deadCodes.size();
			while(k>0)
			{
				fullCode=fullCode+"}";
				k--;
			}
			fullCode=removeSpaces(fullCode);
			System.out.println(fullCode);
			encryptor=new CodeEncryptor();
			sob=new SimpleStringObfuscator();
			fullCode=sob.invert(fullCode);
			System.out.println(fullCode);
			//encryptor.classEncrpytor("Sample");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		finally
		{
			fr.close();
			br.close();
		}
	}

}
