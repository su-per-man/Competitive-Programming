/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFWED
{
    static int[] arr, cache;
    static int n, k;
    static int[][] pref;
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader rd=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(rd);
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    n=Integer.parseInt(st.nextToken());
		    k=Integer.parseInt(st.nextToken());
		    st=new StringTokenizer(br.readLine());
		    arr = new int[n+1];
		    for(int i=1;i<=n;i++){
		        arr[i]=Integer.parseInt(st.nextToken());
		    }
		    pref=new int[101][1001];
		    cache=new int[n+1];
		    Arrays.fill(cache, -1);
		    for(int i=1;i<=n;i++){
		        for(int j=1;j<=100;j++)
                    pref[j][i] = pref[j][i-1] ;
                pref[arr[i]][i]++ ;
            }
		    System.out.println(getAns(1));
		}
	}
	static int getAns( int start  ){
        if( start > n )
            return 0 ;
        if( cache[start] != -1 )
            return cache[start] ;
        int ans = Integer.MAX_VALUE;
        for( int i = start ; i <= n ; i++ )
            ans = Math.min( k + getCommonFamily(start, i) + getAns(i+1) , ans ) ;
        return cache[start] = ans ;
    }
    static int getCommonFamily(int L, int R){
        int sum = 0 ;
        for( int i = 1 ; i <= 100 ; i++ )
            sum += (( pref[i][R] - pref[i][L-1] ) > 1 ? pref[i][R] - pref[i][L-1] : 0)  ;
        return sum ;
    }
}