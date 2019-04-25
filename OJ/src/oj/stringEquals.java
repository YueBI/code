package oj;
import java.util.*;

public class stringEquals {
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s = String.valueOf(arr1);
        t = String.valueOf(arr2);
        if(s.equals(t))
        {
            return true;
        }
        return false;
	}
	public boolean isPalindrome(String s) {
	   s.toLowerCase();
	   int low = 0;
	   int high = s.length()-1;
	   while(low<high)
	   {
		   while(low<high && !Character.isLetterOrDigit(low))
		   {
			   low++;
		   }
		   while(low<high && !Character.isLetterOrDigit(high))
		   {
			   high++;
		   }
		   if(s.charAt(low)!=s.charAt(high))
		   {
			   return false;
		   }
	   }
       return true;
    }

	public static void main(String[] args) {

	}

}
