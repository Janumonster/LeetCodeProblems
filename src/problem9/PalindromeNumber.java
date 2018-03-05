package problem9;

import java.util.Scanner;

/**
 * Determine whether an integer is a palindrome(回文). Do this without extra space.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int res=0;
        int initial=x;
        if (x<0){
            return false;
        }else {
            while(x>0){
                res+=x%10;
                x=x/10;
            }
        }
        return (res==initial);
    }

    public static void main(String[] args){
        int x;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(x));
    }
}
