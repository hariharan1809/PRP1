package LogicBuilding;

import java.util.Scanner;
import java.lang.Math;
public class SecondLast {
	static int sDigit(int num,int digit) {
		digit=(num%100)/10;
		return digit;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int digit=0;
		System.out.println(Math.abs(sDigit(num,digit)));
		s.close();
	}
}
