import java.util.*;

public class arr5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
                int n=s.nextInt();
 
		int a[]=new int[n];
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int max1=a[0];
		int max2=a[0];
		int min1=a[0];
		int min2=a[0];
			for(int i=0;i<a.length;i++){
				if(a[i]> max1)
					max1=a[i];
			}
			for(int i=0;i<a.length;i++){
				if(a[i]>max2 && a[i]!=max1)
					max2= a[i];
			}
			for(int i=0;i<a.length;i++){
				if(a[i]<max1)
					min1=a[i];
			}
			for(int i=0;i<a.length;i++){
				if(a[i]<min2 && a[i]!=min1)
					min2=a[i];
			}
			System.out.println(max1);
			System.out.println(max2);
			System.out.println(min1);
			System.out.println(min2);
			s.close();
	}

}


///Write a program to find the largest 2 
///numbers and the smallest 2 numbers in the given array.