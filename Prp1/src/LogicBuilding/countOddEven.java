package LogicBuilding;
import java.util.*;
public class countOddEven {
	public static void main(String[] args){
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			a[i]=s.nextInt();
		}
		int co=0,ce=0;
		for(int i=0;i<5;i++){
			if(a[i]%2==0){
				ce++;
			}
			else{
				co++;
			}
		}
		System.out.println("The count of even number is "+ce);
		System.out.println("The count of odd number is "+co);
		s.close();
	}
}
