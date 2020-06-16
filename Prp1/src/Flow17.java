import java.util.*;
public class Flow17 {
	public static void main(String[] args) {
	 	Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int r= 0;
        int o=num;
        while(num != 0) {
            int digit = num % 10;
            r=r*10+digit;
            num/=10;
        }
        if(o==r)
        	System.out.println(r+" is a palindrome");
        else
        	System.out.println(r+" is not a palindrome");
        s.close();
    }

}
