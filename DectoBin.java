package guvi11;

import java.util.Scanner;

public class DectoBin {
	public static void main(String args[]){
		int N;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		if(N<=100000){
		String b=Integer.toBinaryString(N);
		System.out.println(b);
		in.close();
	}
	}
}
