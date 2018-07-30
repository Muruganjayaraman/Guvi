package beginner3;

import java.util.Scanner;

public class TimeinMin {
	public static void main(String args[]){
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=a%60;
		c=a/60;
		System.out.println(c+" "+b);
	}

}
