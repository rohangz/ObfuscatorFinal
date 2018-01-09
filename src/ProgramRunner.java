import java.io.*;
import java.util.*;
public class ProgramRunner {
	public static void main(String []agrs)
	{
		System.out.print("Entering try");
		try
		{
		//	System.out.print("working");
		//	runProcess("javac F:\\Tester\\Unobfuscatedcodes\\Testing.java");
		//	System.out.println("compiled");
			//runProcess("set CLASSPATH=F:\\Tester\\Unobfuscatedcodes");
		//	System.out.println("Classpath set");
		//	runProcess("java -cp F:\\Tester\\Unobfuscatedcodes Testing"); 		
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	 private static void printLines(String cmd, InputStream ins) throws Exception {
	        String line = null;
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(ins));
	        while ((line = in.readLine()) != null) {
	            System.out.println(cmd + " " + line);
	        }
	      }

	      private static void runProcess(String command) throws Exception {
	        Process pro = Runtime.getRuntime().exec(command);
	        printLines(command + " stdout:", pro.getInputStream());
	        printLines(command + " stderr:", pro.getErrorStream());
	        pro.waitFor();
	       System.out.println(command + " exitValue() " + pro.exitValue());
	      }

}
