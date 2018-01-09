import java.io.*;
public class SpaceRemoval {
	
	private static final String file="F:\\Tester\\OpaquePredicateCodes\\writer.java";
	private static FileReader fr;
	private static BufferedReader br;
	
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
	
	public static void main(String []args)
	{
			try
			{
				fr=new FileReader(file);
				br=new BufferedReader(fr);
				String line=new String("");
				String fullCode=new String("");
				while((line=br.readLine())!=null)
				{
					fullCode=fullCode+line;
				}
				fullCode=removeSpaces(fullCode);
				System.out.println(fullCode);
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}
