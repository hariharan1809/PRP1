public class arr7 {
	public static void main(String[] args) {
		int[] a={12,34,12,45,67,89};
		int j=0,t=0;
		int n=a.length;
		for (int i=0;i<a.length;i++) {     
			for (int s=i+1;s<a.length;s++) {     
				if(a[i]>a[s]) 
				{    
					t=a[i];    
					a[i]=a[s];    
					a[s]=t;    
				}     
			}     
		}
		int[] temp=new int[n];
		for(int i=0;i<n-1;i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		
		for(int i=0;i<j;i++){
			if(temp[i]!=0){
				System.out.println(temp[i]);
			}
		}
	}
}