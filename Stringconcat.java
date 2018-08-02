package muruga1;
import java.util.Scanner;
public class Stringconcat {
	public static void main(String args[]){
		String S;
		Scanner in=new Scanner(System.in);
		S=in.nextLine();
		StringBuilder a=new StringBuilder(S);
		a.append(".");
		System.out.println(a);
		in.close();
	}

}
