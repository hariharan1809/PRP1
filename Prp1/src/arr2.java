public class arr2 {
	public static void main(String[] args) {
		int[] a={10,22,54,15,67,12,43,25};
		 int max=0;
	      for(int i=0;i<a.length;i++ ) {
	         if(a[i]>max) {
	            max=a[i];
	         }
	      }
	      System.out.println("Maximum value:"+max);
	      int min=a[0]; 
	      for(int i=0;i<a.length;i++ ) {
	         if(a[i]<min) {
	            min=a[i];
	         }
	      }
	      System.out.println("Minimum value:"+min);
	}
}
