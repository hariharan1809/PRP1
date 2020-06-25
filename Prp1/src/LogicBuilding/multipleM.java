package LogicBuilding;
import java.util.*;
public class multipleM {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n=s.nextInt();
		System.out.println("Enter the value of M:");
		int m=s.nextInt();
		if(n%m==0){
			System.out.println(n+" is exact multiple of "+m);
		}
		else{
			System.out.println(n+" is not exact multiple of "+m);
		}
		s.close();
	}
}
