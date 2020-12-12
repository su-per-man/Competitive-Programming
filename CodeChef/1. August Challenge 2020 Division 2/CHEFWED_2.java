import java.util.*;
import java.lang.*;
import java.io.*;

class CHEFWED_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader rd=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(rd);
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    int n=Integer.parseInt(st.nextToken());
		    int k=Integer.parseInt(st.nextToken());
		    st=new StringTokenizer(br.readLine());
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=Integer.parseInt(st.nextToken());
		    }
		    long dp[] = new long[n];
		    dp[0] = k;
		    for(int i=1;i<n;i++){
		        for(int j=-1;j<i;j++){
		            long sum = 0;
		            long fr[] = new long[101];
		            for(int l=j+1;l<=i;l++){
		                fr[arr[l]]++;
		            }
		            for(int l=1;l<=100;l++){
		                if(fr[l]>1){
		                    sum += fr[l];
		                }
		            }
		            if(j == -1){
		                dp[i] = k + sum;
		            }else{
		                dp[i] = Math.min(dp[i], dp[j]+k+sum);
		            }
		        }
		    }
		    System.out.println(dp[n-1]);
		}
	}
}