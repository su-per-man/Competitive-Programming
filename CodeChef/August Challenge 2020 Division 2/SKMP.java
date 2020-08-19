/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SKPM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in) ;
		if(sc.hasNext()){
		    int t= sc.nextInt() ;
		    sc.nextLine() ;
		    while(t-->0){
		        String s= sc.nextLine() ;
		        String p= sc.nextLine() ;
		        
				int[] arr= new int[26] ;
				Arrays.fill(arr,0) ;
				for(int i=0;i<s.length();i++){
					++arr[s.charAt(i)-97] ;
				}
				
				for(int j=0;j<p.length();j++){
					--arr[p.charAt(j)-97] ;
				}
				
				String result="" ;
				String temp="" ;
				String front="" ;
				String rear="" ;
				String s1=p ;
				String s2=p ;
				for(int i=0;i<arr.length;i++){
					if(arr[i]>0){
					char[] ch= new char[arr[i]] ;
					Arrays.fill(ch,(char)(i+97) ) ;
					temp= String.valueOf(ch) ;
					s1= front+temp+s1+rear;
					s2= front+s2+rear+temp ;
					int ref= s1.compareTo(s2) ;
					if(ref>0){
						rear+=temp ;
					}
					else{
						front+=temp ;
					}
					s1=p ;
					s2=p ;
					}
				}
				result= front+p+rear ;
				System.out.println(result) ;
		    }
		}
	}
}