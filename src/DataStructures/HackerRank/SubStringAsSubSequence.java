package DataStructures.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;

public class SubStringAsSubSequence {
	 
	// Function to find the length of
	// smallest substring of a having
	// string b as a subsequence
	@SuppressWarnings("unlikely-arg-type")
	static int minLength(String a, String b)
	{
	     
	    // Stores the characters present
	    // in string b
	    HashMap<Character, Integer> Char = new HashMap<>();
	 
	    for(int i = 0; i < b.length(); i++)
	    {
	        Char.put(b.charAt(i),
	                 Char.getOrDefault(b.charAt(i), 0) + 1);
	    }
	 
	    // Find index of characters of a
	    // that are also present in string b
	    HashMap<Character, ArrayList<Integer>>
	        CharacterIndex = new HashMap<>();
	 
	    for(int i = 0; i < a.length(); i++)
	    {
	        char x = a.charAt(i);
	 
	        // If character is present in string b
	        if (Char.containsKey(x))
	        {
	            if (CharacterIndex.get(x) == null)
	            {
	                CharacterIndex.put(
	                    x, new ArrayList<Integer>());
	            }
	             
	            // Store the index of character
	            CharacterIndex.get(x).add(i);
	        }
	    }
	 
	    int len = Integer.MAX_VALUE;
	 
	    // Flag is used to check if
	    // substring is possible
	    int flag;
	 
	    while (true)
	    {
	 
	        // Assume that substring is
	        // possible
	        flag = 1;
	 
	        // Stores first and last
	        // indices of the substring
	        // respectively
	        int firstVar = 0, lastVar = 0;
	 
	        for(int i = 0; i < b.length(); i++)
	        {
	             
	            // For first character of string b
	            if (i == 0)
	            {
	 
	                // If the first character of
	                // b is not present in a
	                if (CharacterIndex.containsKey(i))
	                {
	                    flag = 0;
	                    break;
	                }
	 
	                // If the first character of b
	                // is present in a
	                else
	                {
	                    int x = CharacterIndex.get(b.charAt(i)).get(0);
	 
	                    // Remove the index from map
	                    CharacterIndex.get(b.charAt(i)).remove(
	                        CharacterIndex.get(b.charAt(i)).get(0));
	 
	                    // Update indices of
	                    // the substring
	                    firstVar = x;
	                    lastVar = x;
	                }
	            }
	 
	            // For the remaining characters of b
	            else
	            {
	                int elementFound = 0;
	                for(var e :
	                    CharacterIndex.get(b.charAt(i)))
	                {
	                    if (e > lastVar)
	                    {
	                         
	                        // If index possible for
	                        // current character
	                        elementFound = 1;
	                        lastVar = e;
	                        break;
	                    }
	                }
	                if (elementFound == 0)
	                {
	                     
	                    // If no index is possible
	                    flag = 0;
	                    break;
	                }
	            }
	        }
	 
	        if (flag == 0)
	        {
	 
	            // If no more substring
	            // is possible
	            break;
	        }
	 
	        // Update the minimum length
	        // of substring
	        len = Math.min(
	            len, Math.abs(lastVar - firstVar) + 1);
	    }
	 
	    // Return the result
	    return len;
	}
	 
	public static void main(String[] args)
	{
		
		SubStringAsSubSequence s1 = new SubStringAsSubSequence();
		// Given two string
	    String a = "abcdefababaef";
	    String b = "abf";
	 
	    String abc = "\""+a+"\"";
	    
	    System.out.println("abc -- : "+abc);
		
		 StringBuilder s = new StringBuilder();
		    s.append(" string is -- : ");
		    s.append(abc);
		    s.append(" .... ba bla ");
		    
		    
		    
		System.out.println(s);
	    
	    int len = minLength(a, b);
	    if (len != Integer.MAX_VALUE)
	    {
	        System.out.println(len);
	    }
	    else
	    {
	        System.out.println("Impossible");
	    }
	    
	   
	}
	

}
	  