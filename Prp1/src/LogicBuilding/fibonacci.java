package LogicBuilding;
import java.util.*;
public class fibonacci {
	public static int fibo(int n){
		if (n <= 1) 
			return n;
		return fibo(n-1)+fibo(n-2); 
	}        
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fibo(n));
		s.close();
	}
}
