import java.util.*;

public class Flow7 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		StringBuffer newStr=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
		{		
			if(Character.isLowerCase(s1.charAt(i)))
				newStr.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
			else
				newStr.setCharAt(i, Character.toLowerCase(s1.charAt(i)));
		}
		System.out.println(s1+"->"+newStr); 
		s.close();
	}
}
