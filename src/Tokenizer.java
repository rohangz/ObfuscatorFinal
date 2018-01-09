import java.util.*;
public class Tokenizer {

		public static void main(String []args)
	{
		 StringTokenizer st=new StringTokenizer("int a=55;if(x==5)return 0;",";");
		 while(st.hasMoreTokens())
		 {
			 System.out.println(st.nextToken());
		 }
	}
}
