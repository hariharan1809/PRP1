import java.util.*;

public class arr6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
                int n=s.nextInt();
 
		int a[]=new int[n];
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int temp;
		for (int i=0;i<a.length;i++) {     
			for (int j=i+1;j<a.length;j++) {     
				if(a[i]>a[j]) 
				{    
					temp=a[i];    
					a[i]=a[j];    
					a[j]=temp;    
				}     
			}     
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		s.close();
	}
}
