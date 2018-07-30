package beginner3;

import java.util.Scanner;

public class TimeinMinMath {
	public static void main(String args[]){
		int a,b,c,d,e,f;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		e=Math.abs(a-c);
		f=Math.abs(b-d);
		System.out.println(e+" "+f);
	}

}
