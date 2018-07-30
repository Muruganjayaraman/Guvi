package beginner4;
import java.util.*;
public class Maimum10 {
	public static void main(String args[]){
		int a[]=new int[10];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[9]);
		in.close();
	}
}


