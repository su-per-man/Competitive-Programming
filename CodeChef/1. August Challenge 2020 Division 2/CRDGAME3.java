import java.util.*;
import java.lang.*;
import java.io.*;

class CRDGAME3
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    InputStreamReader rd =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(rd);
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    int c=Integer.parseInt(st.nextToken());
		    int r=Integer.parseInt(st.nextToken());
		    c=(c%9==0?c/9:c/9+1);
		    r=(r%9==0?r/9:r/9+1);
		    if(r<=c)
		        System.out.println("1 "+ r);
		       else
		        System.out.println("0 "+ c);
		}
	}
}