package practice;

import java.util.*;

public class palindrome {

	public boolean isPalindrome(int x) {
        String str =String.valueOf(x);
        String res = new StringBuffer(str).reverse().toString();
        if(str.equals(res))
            return true;
        return false;
        
    }
	public static void main(String[] args) {
		

	}

}
