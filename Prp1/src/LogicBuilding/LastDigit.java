package LogicBuilding;

import java.util.*;
import java.lang.Math;
public class LastDigit {
	static int lDigit(int num,int digit) {
		digit=num%10;
		return digit;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int digit=0;
		System.out.println(Math.abs(lDigit(num,digit)));
		s.close();
	}

}