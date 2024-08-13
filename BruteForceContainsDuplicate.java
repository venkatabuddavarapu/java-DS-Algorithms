package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BruteForceContainsDuplicate {
	


	public static void main(String[] args) {
		String s="keep";
		String t= "peek";
		
		//brute force
		System.out.println(anagramBrootforce(s,t));
		
		System.out.println(thirdApproach(s,t));
		
		
	}
	
	public static boolean anagramBrootforce(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			int flag =0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					flag = 1;
					c2[j]= '&';		
					break;
				}
			}
			if(flag==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean thirdApproach(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s = new String(c1);
		t = new String(c2);
		if(s.equalsIgnoreCase(t)) {
			return true;
		}
		
		
		return false;
		
	}
	
	

}
