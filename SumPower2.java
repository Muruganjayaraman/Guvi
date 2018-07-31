import java.util.Scanner;

public class SumPower2 {
	public static void main(String args[]){
		int N;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		if(N%2==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		in.close();
	}

}
