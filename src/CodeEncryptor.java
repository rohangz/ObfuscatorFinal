import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import javax.crypto.spec.SecretKeySpec;

public class CodeEncryptor {
	private static final String algorithm="AES";
	private static byte[] byteKey;
	private static BufferedReader br=null;
	private static FileReader fr=null;
	private static FileWriter fw=null;
	private static String fileToBeWritten="F:\\Tester\\Unobfuscatedcodes";
	private static String file="F:\\Tester\\Unobfuscatedcodes";
	private static final String fileWriteMe="F:\\Tester\\Unobfuscatedcodes\\CodesDecrypted";
	public void classDecrpytor(String className)
	{
		System.out.println(className);
		String enfile=file+"\\"+className+"_encrypted.txt";
		String writeFile=fileWriteMe+"\\"+className+".java";
		System.out.println("Entering try ");
		try
		{
			fr=new FileReader(enfile);
			System.out.println("initialized fr");
			fw=new FileWriter(writeFile);
			System.out.println("Initialized fw");
			br=new BufferedReader(fr);
			String cipher="";
			while((cipher=br.readLine())!=null)
			{
				cipher=this.decrypt(cipher);
				System.out.println(cipher);
				fw.write(cipher);
			}
			fw.close();
			fr.close();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void classEncrpytor(String className)
	{
		System.out.println(className);
		String ofile=file;
		String ofiletbw=fileToBeWritten;
		file=file+"\\"+className+".java";
		fileToBeWritten=fileToBeWritten+"\\"+className+"_encrypted.txt";
		try 
		{
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			fw=new FileWriter(fileToBeWritten);
			String line="";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				line=this.encrypt(line);
				fw.write(line);
			}
			fw.close();
			br.close();
			fr.close();
			file=ofile;
			fileToBeWritten=ofiletbw;
			System.out.println(file);
			System.out.println(fileToBeWritten);
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public  String encrypt(String message)
	{
		String cipher="";
		for(int i=0;i<message.length();i++)
		{
			char ci=message.charAt(i);
			ci++;
			cipher=cipher+ci;
		}
		return cipher;
	}
	public  String decrypt(String cipher)
	{
		String message="";
		for(int i=0;i<cipher.length();i++)
		{
			char mi=cipher.charAt(i);
			mi--;
			message=message+mi;
		}
		return message;
	}
	public static void main(String []args)
	{
		String className="";
		Scanner sc=new Scanner(System.in);
		className=sc.nextLine();
		CodeEncryptor cen=new CodeEncryptor();
		cen.classEncrpytor(className);
		cen.classDecrpytor(className);
	/*	System.out.println(className);
		file=file+"\\"+className+".java";
		//file="F:\\Tester\\Unobfuscatedcodes\\Sample.java";
		System.out.println(file);
		try
		{
			fw=new FileWriter(fileToBeWritten+"\\"+className+"_encrypted.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			System.out.println("File initiaqlized");
			String line="";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				line=encrypt(line);
				fw.write(line);
				//		System.out.println("Encrypted=="+line);
				//line=decrypt(line);
			//	System.out.println("Decrypted=="+line);
			}
			fw.close();
			fr.close();
			br.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
	}
}
