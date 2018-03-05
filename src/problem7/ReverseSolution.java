package problem7;

import java.util.Scanner;

import javax.imageio.ImageTypeSpecifier;

public class ReverseSolution {
	
	public int rollback(int x) {
		
		if (x==0) {
			return 0;
		}
		
		String max="2147483647";
		Integer m=x;
		StringBuffer str = new StringBuffer(m.toString());
		str=str.reverse();
		while(str.charAt(0)=='0') {
			str.deleteCharAt(0);
		}
		if (str.length()>=10&&str.charAt(9)!='-') {
			for(int i=0;i<str.length();i++) {
				if (str.charAt(i)==max.charAt(i)) {
					continue;
				}else if (str.charAt(i)>max.charAt(i)) {
					return 0;
				}else {
					break;
				}
			}
		}
		if (str.charAt(str.length()-1)=='-') {
			str=str.deleteCharAt(str.length()-1);
			str=str.insert(0, '-');
		}
		max=str.toString();
		m=Integer.valueOf(max);
		
		return m;
	}

	public static void main(String[] args) {

		ReverseSolution rSolution=new ReverseSolution();
		Scanner input=new Scanner(System.in);
		Integer x=Integer.valueOf(input.nextLine());
		System.out.println(rSolution.rollback(x));
	}

}
