package com.d3achannel.algo;

public class GFG
{ 
	  

	    static boolean findSplit(int []arr) 
	    { 
	    	int n = arr.length;
	        int i; 

	        int preSum = 0; 
	        
	        int ind1 = -1, ind2 = -1; 
	        
	        int S; 
	       
	        S = arr[0]; 
	        for (i = 1; i < n; i++)  
	            S += arr[i]; 
 
	        if(S % 3 != 0) 
	            return false; 

	        int S1 = S / 3; 
	        int S2 = 2 * S1; 
	       
	        for (i = 0; i < n; i++) 
	        { 
	            preSum += arr[i]; 

	            if (preSum % S1 == 0 && ind1 == -1) 
	                ind1 = i; 
	               
	            else if(preSum % S2 == 0) 
	            { 
	                ind2 = i; 

	                break; 
	            } 
	        } 
 
	        if (ind1 != -1 && ind2 != -1) 
	        { 
	            return true; 
	        } 
 
	        return false; 
	    } 
	       

	    public static void main(String args[]) 
	    { 
	        int []arr = { 0,2,1,-6,6,-7,9,1,2,0,1 }; 
	        int n = arr.length; 

	            System.out.print(findSplit(arr)); 
	     
	    } 
	} 
