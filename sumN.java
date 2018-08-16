import java.util.Scanner;
import java.util.stream.IntStream;
public class sumN {
	public static void main(String args[]){
		int N;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		int[] n = new int[N];
		for(int i=0;i<N;i++){
			n[i]=in.nextInt();
		}
		int sum = IntStream.of(n).sum();
		System.out.println("The sum is " + sum);
		in.close();
	}
}
