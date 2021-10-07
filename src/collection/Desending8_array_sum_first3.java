//Wap to get the sum of first 3 minimum no in given array
package collection;



public class Desending8_array_sum_first3 {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {30,50,80,70,90,40,20};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<3;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
