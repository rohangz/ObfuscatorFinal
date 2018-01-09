import java.util.*;
import java.util.regex.*;
public class RegTester {
	
	private String given;
	
	public void setgiven(String given)
	{
		this.given=given;
	}
	
	public RegTester()
	{
		this.given="";
	}
	public RegTester(String given)
	{
		this.given=given;
	}
	public String returnString()
	{
		return given;
	}
	public static void regchecker(String regex,String s)
	{
		try
		{
			
			Pattern p=Pattern.compile(regex,Pattern.DOTALL );
			Matcher m=p.matcher(s);
			while(m.find())
			{
				if(m.group().length()!=0)
					System.out.println(m.group());
			}
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
	}
	public static int methodDetector(String line)
	{
		try {
		Pattern P=Pattern.compile("(public|	private|final|static|protected)");
		Matcher M=P.matcher(line);
		while(M.find())
		{
			if(M.group().length()!=0)
				return 1;
		}
		return -1;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
//		return -1;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String myString="private public public private dsjkfsdjf protected public static void main() ";//sc.nextLine();
		//String regex="(?:(?:public)|(?:private)|(?:static)|(?:protected)\\s+)*";
		String regex="\\\\s*public\\s+static\\s+[\\w\\.\\<\\>,\\s]+\\s+getFieldsConfig\\\\(.*?\\\\)\\\\s*\\\\{.*?\\\\}(?=\\\\s*(public|private|protected|static))";
		String regex2="\\\\s*public\\s+static\\s+[\\w\\.\\<\\>,\\s]+\\s+getFieldsConfig\\\\(.*?\\\\)\\\\s*\\\\{.*?\\\\}(?=(\\\\s*}\\\\s*$))";
		regex="(" + regex + ")|(" + regex2 + "){1}?";
		methodDetector("pjhds public static void main");
		

	}
}
