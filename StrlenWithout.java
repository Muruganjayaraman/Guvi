package beginner3;
import java.util.Scanner;
public class StrlenWithout {
	public static void main(String args[]){
		String S;
		int count=0;
		Scanner in=new Scanner(System.in);
		S=in.next();
		char ch[]=S.toCharArray();
		for(char b:ch){
			count++;
		}
		System.out.println(count);
		in.close();
	}
}
