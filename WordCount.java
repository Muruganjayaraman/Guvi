package beginner4;
import java.util.Scanner;
public class WordCount {
	public static void main(String args[]){
		String a;
		int count=0;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String b[]=a.split("[.]+");
		int c=b.length;
		System.out.println(c);
		in.close();
	}
}


