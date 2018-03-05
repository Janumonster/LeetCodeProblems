package problem5;

/**
 * Given a string s, find the longest palindromic substring in s. 
 * You may assume that the maximum length of s is 1000.
 * @author Peanut
 *
 */

public class Palindromic {
	
	public String longestPalindrome(String s) {
		String answer="";
		if (s.equals("")) {
			return answer;
		}
		int start=0;
		int end=0;
		boolean get=false;
		if (s.length()!=1) {

			for(int i=0;i<s.length()-1;i++) {
				if (get) {
					break;
				}else {
					for(int j=0;j<=i;j++) {
						if (get) {
							break;
						}else {
							for(int k=0;k<=(s.length()-1-i)/2;k++) {
								if (s.charAt(j+k)!=s.charAt(s.length()-1-i+j-k)) {			
										break;
								}
								if (k==(s.length()-1-i)/2) {
									get=true;
									start=j;
									end=s.length()-1-i+j;
									break;
								}
							}
						}
					}
				}				
			}
			answer=s.substring(start,end+1);
		}else {
			answer=s;
		}
		
		return answer; 
    }
	

	public static void main(String[] args) {
		String input="aaassdadaaaaaaaa";
				
		Palindromic palindromic=new Palindromic();
		
		String output=palindromic.longestPalindrome(input);
		System.out.println(output);
	}

}
