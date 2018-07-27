import java.util.Scanner;

public class Set10 {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.next();
		String b=a.replaceAll("[^0123456789]","");
		System.out.println(b);
		in.close();
	}

}
