//Wap to accending all the element in desending order
package collection;

public class Desending2_array_element {

	public static void main(String[] args) {
			int a[]= {30,50,80,70,90,40,20};
			for (int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if (a[i]<a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
			}
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}

	

}
