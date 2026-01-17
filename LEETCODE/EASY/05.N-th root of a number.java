import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int left=1 , right=m;
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            long value = checkroot(mid,n,m);
                
                if(value==m)  {
                    System.out.print(mid);
                    return;
                }
                
                
                else if(value>m)
                right=mid-1;
           
            
               else left=mid+1;
        }
        
        System.out.print("-1");
        
        
    }
    
    public static long checkroot(int mid, int chec,int limit){
        long result=1;
        for(int i =0 ; i<chec ;i++){
            
            result*=mid;
            
            if(result>limit) return result;
            
        
            
        }
         return result;
        
    }
}


N-th root of a number
Last Updated : 3 Oct, 2025
Given two integers n and m, find the n-th root of m. The n-th root of m is an integer x such that x^n = m. If no such integer exists, return -1.

Examples: 

Input: n = 3, m = 27
Output: 3
Explanation: 33 = 27

Input: n = 3, m = 9
Output: -1
Explanation: 3rd root of 9 is not integer.
