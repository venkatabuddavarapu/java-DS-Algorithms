package com;

import java.util.LinkedHashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
 
        int left = 0;
        int right = 0;
 
        int res = 0;
        
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
            System.out.println(chars[r]);
 
            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
 
            res = Math.max(res, right - left + 1);
 
            right++;
        }
        return res;
    }

    public static void main(String args[]) {
        // Your code goes here
    	LengthOfLongestSubstring ob = new LengthOfLongestSubstring();
        String s = "hellotmna";
        System.out.println(ob.lengthOfLongestSubstring1(s));
    }
    
	public String lengthOfLongestSubstring1(String s) {
       Set<Character> set = new LinkedHashSet<>();
       int longestSubStrLen = 0;
       String longestSubStr = "";
       
       char[] ch = s.toCharArray();
       String temp = "";
       for(int i=0;i<ch.length;i++) {
    	   if(longestSubStrLen<temp.length()) {
			   longestSubStrLen=temp.length();
			   longestSubStr = temp;
		   }
    	   if(set.contains(ch[i])) {    		   
    		   temp="";
    		   set = new LinkedHashSet<>();
    	   }
    	   
    	   set.add(ch[i]);
    	   temp+=ch[i];
    	   
       }
       
       if(longestSubStrLen<temp.length()) {
		   longestSubStrLen=temp.length();
		   longestSubStr = temp;
	   }
       
       return longestSubStr;
    }

}