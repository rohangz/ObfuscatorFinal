import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleTestingcodes {

	public static void main(String[] args)
	{
		//String p="\".*\"";
		String p=".*123";
		System.out.println(p);
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Pattern p1=Pattern.compile(p);
		Matcher m=p1.matcher(input);
		boolean b=m.matches();
		System.out.println(b);
		while(m.find()==true)
		{
			System.out.println(m.group());
		}
	}
}
