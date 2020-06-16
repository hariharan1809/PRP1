public class Flow15 {
	public static void main(String args[]){
		if(args.length==0){
			System.out.println("Please enter the month in numbers");
			System.exit(0);
		}
		else{
			for (int i=1;i<=Integer.parseInt(args[0]);i++)
			{
				int j=1;
				while(j<=i){
					System.out.print("* ");
					j++;
				}
			System.out.println();
			}           
		}
	}
}
