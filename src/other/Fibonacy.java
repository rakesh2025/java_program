package other;

public class Fibonacy {

	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		int count=0;
		for(int k=0;k<=10;k++) {
			i=count;
			count=j;
			j=count+i;
			System.out.print(i+" ");
			
			
		}

	}

}
