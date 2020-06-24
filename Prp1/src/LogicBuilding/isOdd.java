package LogicBuilding;
import java.util.*;
public class isOdd {
	static int Odd(int n){
		if(n%2!=0){
			return 2;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(Odd(n));
		s.close();
	}
}