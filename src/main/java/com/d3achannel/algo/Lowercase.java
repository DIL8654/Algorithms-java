package com.d3achannel.algo;

public class Lowercase {
	
	
	
	
	public static String toLowerCase(String str) {
		
		 
		
		for(int i = 0; i < str.toCharArray().length ; i++ )
		{
			int c = (int)str.charAt(i);
			
			if(c >= 65 && c <= 97)
			{
				char  x  = (char) (c+32);
				str = str.replace(str.charAt(i), x);
			}
		 
		}
		return str;
    }
	
	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println(toLowerCase(str));
		
//		char a = 'a';
//		char A = 'A';
//		
//		System.out.println((int)a);
//		System.out.println((int)A);
//		System.out.println((int)'z');
//		System.out.println((int)'Z');
//
//		char x = (char)65+32;
//		System.out.println(x);
	}

}
