package beginner4;

import java.util.Scanner;

public class NumberCount {
	public static void main(String args[]){
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		if(s.length()<=1000){
		String b=s.replaceAll("[^0123456789]","");
		System.out.println(b.length());
	}
	}
}
