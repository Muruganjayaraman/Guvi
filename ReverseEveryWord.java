import java.util.*;
class ReverseEveryWord 
{
	public static void main(String args[]){
		String S,rev="";
		Scanner in=new  Scanner(System.in);
		S=in.nextLine();
		int N=S.length();
		if(N>=1 && N<=100000){
		String b[]=S.split(" ");
		for(String c:b){
			StringBuilder d=new StringBuilder(c);
			d.reverse();
			rev=rev+d.toString()+" ";
		}
		System.out.println(rev);
		in.close();
	}
	}
}
