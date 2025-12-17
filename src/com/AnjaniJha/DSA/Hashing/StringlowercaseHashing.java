package com.AnjaniJha.DSA.Hashing;
import java.util.Scanner;

public class StringlowercaseHashing {
        public static void main(String[] args) {
            //fix array size before creating an array
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();

            //Precompute size= 26(alphabets)
            int[] hash = new int[26]; // a to z
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if ( ch >= 'a' && ch <= 'z') {
                    hash[ch - 'a']++;
                }
            }

            //fetching as per query
            System.out.println("Enter number of queries:");
            int q = input.nextInt();

            while ( q-- > 0) {
                System.out.println("Enter character to query: ");
                char ch = input.next().charAt(0);
                if ( ch >= 'a' && ch <= 'z') {
                    System.out.println("Frequency: "+ hash[ch - 'a']);
                }else {
                    System.out.println("Invalid character");
                }

            }
            input.close();
        }

    }

