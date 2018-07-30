package beginner4;

import java.util.Scanner;

public class ChatactersCount {
	public static void main(String args[]){
		String s;
		int c;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		if(s.length()<=1000){
		String b=s.replaceAll("[^~!@#$%&*()^-_=+';.,]","");
		System.out.println(b.length());
	}
	}
}
