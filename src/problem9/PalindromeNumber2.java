package problem9;

import java.util.Scanner;

public class PalindromeNumber2 {

    public boolean isPalindrome(int x) {
       int a=1,b=x;

       if (x<0)return false;
       if (x<10)return true;
       while(b/10>0){
           a=a*10;
           b=b/10;
       }

       while (a>=10){
           if (x/a!=x%10)return false;
           x=x%a/10;
           a/=100;
       }
       return true;

    }

    public static void main(String[] args){
        int x;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        PalindromeNumber2 palindromeNumber=new PalindromeNumber2();
        System.out.println(palindromeNumber.isPalindrome(x));
    }

}
