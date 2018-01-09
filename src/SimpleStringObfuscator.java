import java.io.PrintStream;
import java.util.Random;

public class SimpleStringObfuscator {
	
	public static void callString()
	{
//		String obs=(new Object() {int t;public String toString() {byte[] buf = new byte[11];t = 1758384674;buf[0] = (byte) (t >>> 6);t = -2029629251;buf[1] = (byte) (t >>> 12);t = 191162907;buf[2] = (byte) (t >>> 19);t = 690051855;buf[3] = (byte) (t >>> 6);t = 933379669;buf[4] = (byte) (t >>> 23);t = 1211000881;buf[5] = (byte) (t >>> 22);t = 787341238;buf[6] = (byte) (t >>> 21);t = 729497330;buf[7] = (byte) (t >>> 19);t = -1379172776;buf[8] = (byte) (t >>> 18);t = -1005361949;buf[9] = (byte) (t >>> 11);t = -1299041733;buf[10] = (byte) (t >>> 7);return new String(buf);}}.toString());
	//	System.out.println(obs);
	//	String obs=(new Object() {int t;public String toString() {byte[] buf = new byte[11];t = -2054019520;buf[0] = (byte) (t >>> 14);t = 1510157955;buf[1] = (byte) (t >>> 11);t = 381885391;buf[2] = (byte) (t >>> 20);t = 863148837;buf[3] = (byte) (t >>> 6);t = -67929829;buf[4] = (byte) (t >>> 11);t = 135133261;buf[5] = (byte) (t >>> 22);t = 1708933891;buf[6] = (byte) (t >>> 18);t = -445189610;buf[7] = (byte) (t >>> 12);t = -511455662;buf[8] = (byte) (t >>> 5);t = 325342452;buf[9] = (byte) (t >>> 19);t = -175957717;buf[10] = (byte) (t >>> 6);return new String(buf);}}.toString()),(new Object() {int t;public String toString() {byte[] buf = new byte[8];t = -2054874164;buf[0] = (byte) (t >>> 6);t = 127992408;buf[1] = (byte) (t >>> 11);t = 1559176942;buf[2] = (byte) (t >>> 1);t = 1400421468;buf[3] = (byte) (t >>> 19);t = 2004002681;buf[4] = (byte) (t >>> 16);t = -350828182;buf[5] = (byte) (t >>> 12);t = -1261786335;buf[6] = (byte) (t >>> 3);t = -1217297621;buf[7] = (byte) (t >>> 4);return new String(buf);}}.toString()),o

	}
	public String invert(String line)
	{
		SimpleStringObfuscator sob=new SimpleStringObfuscator();
		String sol="";
		int i=0,j=1;
		while(i<j &i<line.length())
		{
			
			if(line.charAt(i)!=34)
			{
				sol=sol+line.charAt(i);
				i++;
				j++;
			}
			else
			{
				String sol2="";
				while(j<line.length())
				{
					if(line.charAt(j)==34)
					{
						break;
					}
					else
					{
						sol2=sol2+line.charAt(j);
						j++;
					}
				}
				i=j+1;
				j++;
				j++;
				sol2=sob.stringObfuscate(sol2);
				sol=sol+sol2;
			}
		}
		return sol;
	}
	
	
	public static void main(String []args)
	{
		SimpleStringObfuscator sob=new SimpleStringObfuscator();
	//	String sol=sob.stringObfuscate("HELLO WORLD");
//		System.out.print(sol);
		String sol="";
	//	sol=sob.invert("String obs=\"Hello world\",obb=\"Hello world2\";");
	//	System.out.println(sol);
	//	callString();
		/*
		 * 
		 *  String obs="OBSERIES1 ",obs2="s;kdmsam";
		 *  int a=55,x=79;
		 */

		String a;
		
		a="package obfuscation;\r\n" + 
				"\r\n" + 
				"import java.util.*;public class Sample{public static void main(String []agrs){int x=10;if((x*(x*x-1))%3==1){String alphaToBeUsed=\"Complex\";int dothis=5;for(int i=0;i<alphaToBeUsed.length();i++){for(int j=0;j<alphaToBeUsed.length();j++)System.out.println(\"values are\");}switch(dothis){case 1:for(int kk=9;kk>=0;kk--);}}else{boolean xx=false;int yy=10;while(yy>=0)yy--; if(xx==true){Scanner s=new Scanner(System.in);int myval=s.nextInt();if(myval==1){String []alpha=new String[myval];}else{System.out.println(\"Faulty\");}}else{boolean xxx=true,yyy=false;while(xxx==true&&yyy==false){xxx=false;}if(xxx==true){int _0xc837128kadfkka=0;int $idsanscjnxjb__90909=10,$kdsfkjf3489583459xcxcbnsnb=99;while(x==0){$idsanscjnxjb__90909=$kdsfkjf3489583459xcxcbnsnb-104; if($idsanscjnxjb__90909<0) $idsanscjnxjb__90909=$idsanscjnxjb__90909+10;else $kdsfkjf3489583459xcxcbnsnb=$kdsfkjf3489583459xcxcbnsnb-10;}}else{int zzzz=10;int yyyy=20;int xxxx=100;if((xxxx+yyyy+zzzz)%2!=0){loop1:for (int i = 0; i < 5; i++){for (int j = 0; j < 5; j++){if (i == 3)break loop1;System.out.println(\"i = \" + i + \" j = \" + j);}}}else{int xcc79600=95,xcc79601=96; if((xcc79600+xcc79601)%2==0){for(int i=0;i<10;i++){System.out.println(\"ljsahdjshd\");}int xm=0;while(xm<=0){if(xm<=0)xm++; if(xm<=0&&xm%2==0)xm++;else if(xm<=0&&xm%2!=0)xm=xm-3;else xm=xm-10;xm++; }}else{int hrsxc146373874=92; String yut5678932=new String(\"this is a bug\"); if(hrsxc146373874==yut5678932.length()){for(int k765=0;k765>0;k765++){boolean xyz92838923=true; if(xyz92838923==true){boolean hdsfjdfdjf=false;}}}else{Scanner sc=new Scanner(System.in);int n=sc.nextInt();int n2=sc.nextInt();int sum=n+n2;System.out.println(sum);String work=\"Work is Done\";System.out.println(work);}}}}}}}}\r\n" + 
				"";
	//	System.out.println(a.charAt(a.length()-1));
		a=sob.invert(a);
		System.out.println(a);

	//	a=(new Object() {int t;public String toString() {byte[] buf = new byte[40];t = -959104522;buf[0] = (byte) (t >>> 12);t = 1128125349;buf[1] = (byte) (t >>> 3);t = 677759113;buf[2] = (byte) (t >>> 10);t = -1525623860;buf[3] = (byte) (t >>> 9);t = 1899447027;buf[4] = (byte) (t >>> 15);t = -159686970;buf[5] = (byte) (t >>> 20);t = 1644232102;buf[6] = (byte) (t >>> 20);t = 1091943707;buf[7] = (byte) (t >>> 10);t = -2123376956;buf[8] = (byte) (t >>> 1);t = 1056781543;buf[9] = (byte) (t >>> 1);t = -1197570803;buf[10] = (byte) (t >>> 15);t = -1876797639;buf[11] = (byte) (t >>> 16);t = -1197494423;buf[12] = (byte) (t >>> 17);t = 1117265832;buf[13] = (byte) (t >>> 24);t = 1859539945;buf[14] = (byte) (t >>> 8);t = -231918718;buf[15] = (byte) (t >>> 19);t = -581875365;buf[16] = (byte) (t >>> 10);t = 244982971;buf[17] = (byte) (t >>> 7);t = 1364112587;buf[18] = (byte) (t >>> 22);t = -1447189168;buf[19] = (byte) (t >>> 23);t = 681103657;buf[20] = (byte) (t >>> 15);t = -124774004;buf[21] = (byte) (t >>> 15);t = 1494514216;buf[22] = (byte) (t >>> 19);t = 256173657;buf[23] = (byte) (t >>> 1);t = -904144024;buf[24] = (byte) (t >>> 14);t = -913914385;buf[25] = (byte) (t >>> 9);t = 2025812950;buf[26] = (byte) (t >>> 8);t = -320314358;buf[27] = (byte) (t >>> 9);t = -1634476717;buf[28] = (byte) (t >>> 23);t = 154722442;buf[29] = (byte) (t >>> 2);t = 384421779;buf[30] = (byte) (t >>> 10);t = 205227587;buf[31] = (byte) (t >>> 16);t = -646532793;buf[32] = (byte) (t >>> 12);t = 383673482;buf[33] = (byte) (t >>> 8);t = -593569154;buf[34] = (byte) (t >>> 9);t = -892713753;buf[35] = (byte) (t >>> 1);t = -1369369784;buf[36] = (byte) (t >>> 16);t = -690798915;buf[37] = (byte) (t >>> 20);t = -1841015396;buf[38] = (byte) (t >>> 13);t = -493126026;buf[39] = (byte) (t >>> 1);return new String(buf);}}.toString());
	//	a=(new Object() {int t;public String toString() {byte[] buf = new byte[14];t = -1261664296;buf[0] = (byte) (t >>> 23);t = -1408379687;buf[1] = (byte) (t >>> 13);t = 1952843764;buf[2] = (byte) (t >>> 24);t = -600549118;buf[3] = (byte) (t >>> 3);t = -1405324842;buf[4] = (byte) (t >>> 21);t = 1030043441;buf[5] = (byte) (t >>> 24);t = 901220347;buf[6] = (byte) (t >>> 24);t = 1134259413;buf[7] = (byte) (t >>> 2);t = 202528795;buf[8] = (byte) (t >>> 9);t = -1269089230;buf[9] = (byte) (t >>> 7);t = 719449262;buf[10] = (byte) (t >>> 11);t = 469006861;buf[11] = (byte) (t >>> 23);t = -91429711;buf[12] = (byte) (t >>> 10);t = 499532714;buf[13] = (byte) (t >>> 23);return new String(buf);}}.toString());
	//String obs=(new Object() {int t;public String toString() {byte[] buf = new byte[10];t = 1338001982;buf[0] = (byte) (t >>> 24);t = 2047981840;buf[1] = (byte) (t >>> 19);t = 176067960;buf[2] = (byte) (t >>> 21);t = -1200023830;buf[3] = (byte) (t >>> 10);t = 759785280;buf[4] = (byte) (t >>> 18);t = 1594266386;buf[5] = (byte) (t >>> 9);t = -1245339000;buf[6] = (byte) (t >>> 7);t = -1700795619;buf[7] = (byte) (t >>> 19);t = -1940761030;buf[8] = (byte) (t >>> 22);t = 135058824;buf[9] = (byte) (t >>> 22);return new String(buf);}}.toString()),obs2=(new Object() {int t;public String toString() {byte[] buf = new byte[9];t = 1953729636;buf[0] = (byte) (t >>> 16);t = -786579717;buf[1] = (byte) (t >>> 15);t = 771529565;buf[2] = (byte) (t >>> 3);t = 1224887429;buf[3] = (byte) (t >>> 5);t = -330977873;buf[4] = (byte) (t >>> 5);t = 1938595233;buf[5] = (byte) (t >>> 24);t = 1643710646;buf[6] = (byte) (t >>> 24);t = -1228354008;buf[7] = (byte) (t >>> 23);t = -1460872309;buf[8] = (byte) (t >>> 18);return new String(buf);}}.toString())
	
	}
    public String stringObfuscate(String args) {
    	String sol="";
    	if(args.length()==0)
    		return sol;
        if (args != null && args.length() > 0) {
            Random r = new Random(System.currentTimeMillis());
            byte[] b = args.getBytes();
            int c = b.length;
            PrintStream o = System.out;

            o.print("(new Object() {");
            sol=sol+"(new Object() {";
            o.print("int t;");
            sol=sol+"int t;";
            o.print("public String toString() {");
            sol=sol+"public String toString() {";
            o.print("byte[] buf = new byte[");
            sol=sol+"byte[] buf = new byte[";
            o.print(c);
            sol=sol+c;
            o.print("];");
            sol=sol+"];";

            for (int i = 0; i < c; ++i) {
                int t = r.nextInt();
                int f = r.nextInt(24) + 1;

                t = (t & ~(0xff << f)) | (b[i] << f);
                o.print("t = ");
                sol=sol+"t = ";
                o.print(t);
                sol=sol+t;
                o.print(";");
                sol=sol+";";
                o.print("buf[");
                sol=sol+"buf[";
                o.print(i);
                sol=sol+i;
                o.print("] = (byte) (t >>> ");
                sol=sol+"] = (byte) (t >>> ";
                o.print(f);
                sol=sol+f;
                o.print(");");
                sol=sol+");";
                
                
               
            }

            o.print("return new String(buf);");
            sol=sol+"return new String(buf);";
            o.print("}}.toString())");
            sol=sol+"}}.toString())";
            o.println();
        }
        return sol;
    }
}
