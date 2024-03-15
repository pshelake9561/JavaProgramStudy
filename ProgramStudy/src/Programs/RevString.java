package Programs;
import java.util.Scanner;

public class RevString {
	public void revstr(String str1, String str2) {
		String S1 = str1; 
		String S2 = "";
		String S3 = str2;
		String S4 = "";
		for (int i=S1.length();i>0;i--) {
			
			//System.out.print(S1.charAt(i-1));
			S2 = S2 + S1.charAt(i-1);
		}
		for (int j=S2.length();j>0;j--) {
			S4 = S4 + S3.charAt(j-1);
		}

		System.out.println(S2+ " "+ S4);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:");
		String s1=sc.next();
		System.out.println("Enter Second String: "); 
		String s2=sc.next();
		
		RevString RS = new RevString();
		RS.revstr(s1,s2);
		
	}

}
