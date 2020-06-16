public class arr1 {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		float avg=0.0f;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			avg=(float)sum/a.length;
		}
		System.out.println(sum);
		System.out.printf("%.1f",avg);
	}
}
