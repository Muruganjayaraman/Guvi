import java.util.Scanner;

public class BinaryorNot {
	public static void main(String args[]){
	String a;
	Scanner in=new Scanner(System.in);
	a=in.next();
	String b=a.replaceAll("[^01]","");
	if(b.equals(a)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	in.close();
	}
}
