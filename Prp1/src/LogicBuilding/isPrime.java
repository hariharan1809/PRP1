package LogicBuilding;
import java.util.*;
public class isPrime {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0)
				c=1;
				break;
		}
		if(n==1)
			System.out.println("1 is neither prime nor composite");
		else{
			if(c==0)
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
		}
		s.close();
	}
}
