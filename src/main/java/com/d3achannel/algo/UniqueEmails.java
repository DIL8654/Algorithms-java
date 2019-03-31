package com.d3achannel.algo;

import java.util.HashSet;

public class UniqueEmails 
{
	public int numUniqueEmails(String[] emails) 
	{
		HashSet<String> uniqueEmails = new HashSet<>();
		
		for (String email : emails) 
		{
			uniqueEmails.add(cleanEmail(email));
		}
		
		return uniqueEmails.size();
	}

	private String cleanEmail(String email) 
	{
		String clean = email.substring(0, email.indexOf("@")).replace(".", "");
		
		if (clean.contains("+")) {
			clean = clean.substring(0, clean.indexOf("+"));
		}
		clean  +=email.substring(email.indexOf("@"));
		System.out.println(clean);
		return clean;
	}
	
	public static void main(String[] args) 
	{
		String[] arr = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		UniqueEmails e = new UniqueEmails();
		
		System.out.println(e.numUniqueEmails(arr));
	}
}