package hi;
import java.util.Scanner;
public class Append {
	public static void main(String args[]){
		String S;
		Scanner in=new Scanner(System.in);
		S=in.next();
		int N=S.length();
		if(N<=100000){
		StringBuffer b=new StringBuffer(S);
		b.append(" Answer");
		System.out.println(b);
		in.close();
	}
	}
}
