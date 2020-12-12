import java.util.*;
import java.lang.*;
import java.io.*;

class SKMP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(rd);
		int t=Integer.parseInt(br.readLine());;
		while(t-->0){
		    String inp=br.readLine();
		    String str=br.readLine();
		    
		    int[] rInp = new int[26];
		    for(int i=0;i<inp.length();i++)
		        rInp[(int)inp.charAt(i)-'a']++;
		    for(int i=0;i<str.length();i++)
		        rInp[(int)str.charAt(i)-'a']--;
		    int strPos=0;
		    while(strPos+1<str.length() && str.charAt(strPos)==str.charAt(strPos+1))
		        strPos++;
		    int ch=str.charAt(strPos)-'a';
		    if(strPos+1<str.length() && str.charAt(strPos)<str.charAt(strPos+1))
		        ch++;
		    StringBuilder op = new StringBuilder();
		    int apFlag=0;
		    for(int i=0;i<26;i++){
		        int rept=rInp[i];
		        if(ch==i && apFlag==0){
		            op.append(str);   
		            apFlag=1;
		        }
		        while(rept-->0)
		            op.append((char)(i+'a'));
		    }
		    System.out.println(op.toString());
		}
	}
}