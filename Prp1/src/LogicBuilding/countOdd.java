package LogicBuilding;

import java.util.*;

public class countOdd {
	public static void main(String[] args){
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			a[i]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<5;i++){
			if(a[i]%2!=0){
				c++;
			}
		}
		System.out.println("The count of odd number is "+c);
		s.close();
	}
}
