package problem6;

import java.util.Scanner;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * 2018-2-18 11:50:56
 *
 */

public class zigzag {
    public String convert(String s, int numRows) {
        if (s.isEmpty())return "";
        if (numRows==1||numRows>=s.length())return s;
        int stepa=0;
        int stepb=0;
        StringBuilder answer=new StringBuilder();
        stepa=numRows*2-2;

        for (int i=0;i<numRows;i++){
            int outnum=i;

            answer.append(s.charAt(outnum));

            while(outnum<=s.length()-1){
                if (stepa!=0&&outnum+stepa<=s.length()-1){
                   answer.append(s.charAt(outnum+stepa));
                   }
                outnum=outnum+stepa;
                if (stepb!=0&&outnum+stepb<=s.length()-1){
                    answer.append(s.charAt(outnum+stepb));
                }
                outnum=outnum+stepb;
            }
            stepa=stepa-2;
            stepb=stepb+2;
        }

        return answer.toString();
    }

    public static void main(String[] args){
        String input="";
        int n=0;
        Scanner scanner=new Scanner(System.in);
        input=scanner.next();
        n=scanner.nextInt();

        zigzag zigzag=new zigzag();
        System.out.println(zigzag.convert(input,n));
    }
}
