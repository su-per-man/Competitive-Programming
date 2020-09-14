import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    int[] arr=new int[n];
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    for(int i=0;i<n;i++)
		        arr[i]=Integer.parseInt(st.nextToken());
		    Arrays.sort(arr);
		    int count=0,lastEl=0;
		    for(int i=0;i<n-1;i++){
		        if(arr[i]!=arr[i+1] && arr[i]!=0){
		         count++;
		         lastEl=arr[i];
		        }
		    }
		    if(lastEl!=arr[n-1] && arr[n-1]!=0)
		        count++;
		    System.out.println(count);
		}
	}
}
