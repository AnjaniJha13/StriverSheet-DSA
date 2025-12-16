package com.AnjaniJha.DSA.Recursion;

public class PalindromeofString {
    public boolean palindromeCheck(String s) {
        return helper(s, 0, s.length() - 1);
    }
        private boolean helper(String s,int left,int right) {
            if (left >= right) {
                return true;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            return helper(s,left + 1,right - 1);
        }

    }

    //while loop
//    public boolean palindromeCheck(String s) {
//        int i = 0;
//        int n = s.length();
//        while(i < n/2){
//            if (s.charAt(i) != s.charAt(n-1-i)) {
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//}

