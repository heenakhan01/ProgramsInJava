import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
       int cnt=0;
       for(int m=i;m<=j;m++){
    	  // System.out.println("m " + m);
           int diff = Math.abs(m-Solution.reverse(m));
    	 //  System.out.println("mrev " + Solution.reverse(i));

           if(diff%k==0){
        	   int result = diff%k;
        	  // System.out.println(cnt +" "+ result);
               cnt++;
           }
       }
        
        return cnt;
        

    }
    
    static int reverse(int n){
        
        int num=n; int rev=0;  
        while(num!=0){
            int rem=num%10;
             rev=rev*10 + rem;
             num=num/10;
        }
        
        return rev;
    }


    public static void main(String[] args) throws IOException {
       System.out.println(Solution.beautifulDays(20, 23, 6));
    }
}
