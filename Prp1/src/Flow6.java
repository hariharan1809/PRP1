import java.util.*;

public class Flow6 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String g=s.next();
		if(g.equals("Female") && (Integer.parseInt(args[0])>=1 && Integer.parseInt(args[0])<=58))
			System.out.println("The percentage of interest is 8.2%");
		else if(g.equals("Female") && (Integer.parseInt(args[0])>=59 && Integer.parseInt(args[0])<=100))
			System.out.println("The percentage of interest is 9.2%");
		else if(g.equals("Male") && (Integer.parseInt(args[0])>=1 && Integer.parseInt(args[0])<=58))
			System.out.println("The percentage of interest is 8.4%");
		else if(g.equals("Male") && (Integer.parseInt(args[0])>=59 && Integer.parseInt(args[0])<=100))
			System.out.println("The percentage of interest is 10.5%");
		s.close();	
	}
}

