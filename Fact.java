package player4;
import java.util.Scanner;
public class Fact {
	public static void main(String args[]){
		int a,fact=1;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a<=25){
		for(int i=1;i<=a;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		in.close();
	}
	}
}
