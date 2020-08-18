import java.util.*;
import java.lang.*;
import java.io.*;

class LINCHESS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(rd);
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    int n=Integer.parseInt(st.nextToken());
		    int c=Integer.parseInt(st.nextToken());
		    st=new StringTokenizer(br.readLine());
		    int min=-1,val=-1;
		    while(n-->0){
		        int temp=Integer.parseInt(st.nextToken());
		        if(c%temp==0 && (c/temp<val || val==-1)){
		            min=temp;
		            val=c/temp;
		        }
		    }
		    System.out.println(min);
		}
	}
}