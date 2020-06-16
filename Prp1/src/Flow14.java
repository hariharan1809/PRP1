import java.util.*;
public class Flow14 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,m;
        while(n>0){
        	m=n%10;
        	sum=sum+m;
        	n=n/10;
        }
        System.out.print(sum);
        s.close();
	}
}
 
