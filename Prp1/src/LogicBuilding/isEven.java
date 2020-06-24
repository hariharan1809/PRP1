package LogicBuilding;
import java.util.*;
public class isEven {
	static int Even(int n){
		if(n%2==0){
			return 2;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(Even(n));
		s.close();
	}
}
