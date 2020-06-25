package LogicBuilding;
import java.util.*;
public class nthPrime {
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int n,count=0,num=1,i;
	    System.out.println("Enter Nth Number:");
	    n=s.nextInt();
	    while (count<n){
	        num=num+1;
	        for (i=2;i<=num; i++){
	          if (num % i == 0) {
	            break;
	          }
	        }
	        if ( i == num){
	          count = count+1;
	        }
	      }
	    System.out.println(n+"th prime number is "+num);
	     s.close();
	 }
}
