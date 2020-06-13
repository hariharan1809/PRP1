public class Flow5 {
	public static void main(String[] args){
		char c='0';
		if(c>=48 && c<=57)
			System.out.println("Digit");
		else if((c>=65 && c<=90)||(c>=97 && c<=122))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}
}
