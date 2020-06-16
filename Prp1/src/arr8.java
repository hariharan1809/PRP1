import java.util.*;

public class arr8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
                int n=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		boolean c=true;
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]!=6 && c==true){
				sum=sum+a[i];
			}
			else if(a[i]==6){
				System.out.println(i);
				if((i+1) == a.length)
	                sum = sum+a[i];
	            else
	            	c = false;
			}
			else if(a[i]==7)
				c=true;
		}
		System.out.print(sum);
		s.close();
	}
}
