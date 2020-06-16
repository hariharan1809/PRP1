public class Flow13 {
	public static void main(String[] args) {

        int s=10,e=99;
        for(int i=s;i<=e;i++){
        	if(i>1){
        		for(int j=2;j<i;i++){
        			if((i%j)==0)
        				break;
        			else
        				System.out.print(i+" ");
        		}
        	}
        }
    }

}
