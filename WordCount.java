package beginner4;
import java.util.Scanner;
public class WordCount {
	public static void main(String args[]){
		String s;
		int count=0;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		if(s.length()<=1000){
		String b[]=s.split("[.]+");
		int c=b.length;
		System.out.println(c);
		in.close();
	}
}
}


