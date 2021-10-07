package strring;

public class Sum_of_number {

	public static void main(String[] args) {
		int num=898;
		int sum=0;
		int v=0;
		while(num!=0) {
			v=num%10;
			sum=sum+v;
			num=num/10;
		}
		System.out.println(sum);

	}

}
