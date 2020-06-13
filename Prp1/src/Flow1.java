import java.util.*;
public class Flow1 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n1==(n2%10)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		s.close();
	}
}
