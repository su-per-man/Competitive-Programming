import java.util.*;
import java.lang.*;
import java.io.*;

class CHEFWARS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int h=Integer.parseInt(st.nextToken());
		    int p=Integer.parseInt(st.nextToken());
		    while(p>0 && h>0 && h>p){
		        h-=p;
		        p/=2;
		    }
		    if(h>p)
		        System.out.println(0);
		       else
		        System.out.println(1);
		}
	}
}