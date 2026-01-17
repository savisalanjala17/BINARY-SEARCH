import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        
        
        int left=0 , right=n-1;
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            if(a[mid]==0) left=mid+1;
            
            else if(a[mid-1]==1 && mid>0) right=mid-1;
            
            else {
                System.out.print(mid);
                return;
            }
            
           
        }
        
        System.out.print("-1");
        
        
    }

  


  📌 Problem: Find First 1 in a Binary Sorted Array
🔹 Problem Statement

You are given a binary array arr of length n consisting only of 0s and 1s.
The array is sorted in non-decreasing order, meaning all 0s appear before all 1s.

Your task is to find the index of the first occurrence of 1 in the array.

If the array does not contain any 1, return -1.

🔹 Input Format

An integer n — the size of the array

An integer array arr of length n where each element is either 0 or 1

🔹 Output Format

Return the 0-based index of the first 1

Return -1 if no 1 exists

🔹 Examples
Example 1
Input:
n = 7
arr = [0, 0, 0, 1, 1, 1, 1]

Output:
3


Explanation:
The first 1 appears at index 3.

Example 2
Input:
n = 5
arr = [0, 0, 0, 0, 0]

Output:
-1


Explanation:
There is no 1 in the array.
    
}



