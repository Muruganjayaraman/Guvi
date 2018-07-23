import java.util.Scanner;

public class Eight1 {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.next();
		StringBuilder b=new StringBuilder(a);
		b.reverse();
		String c=b.toString();
		if(a.equals(c)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
