public class arr3 {
	public static void main(String[] args) {
		int[] a={1,4,34,56,7};
		int s=90,c=0;
		int k=0;
		for(int i=0;i<a.length;i++){
			if(s==a[i]){
				c=1;
				k=i;
				break;
			}
			else{
				c=0;
			}
		}
		if(c==1){
		 	System.out.print("Value present in position "+k);
		}
		else{
			System.out.print("-1");
		}
	}
}
