package hunter4;
import java.util.Scanner;
public class Product {
	public static void main(String args[]){
		int N,i,fact=1;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		if(N>=1 && N<=100000){
		int b[]=new int[N];
		for(i=0;i<N;i++){
			b[i]=in.nextInt();
			fact=fact*b[i];
		}
		System.out.println(fact);
		in.close();
	}
	}
}

