////Wap to first minimum no of the array
package collection;

public class Secondminimumno6_array_element2 {

	public static void main(String[] args) {
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
		
			System.out.println(a[1]);
	}

}
