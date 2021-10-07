//wap to add to arry element 
///important
//interview
package collection;

public class Add_2_array {

	public static void main(String[] args) {
		int a[]= {8,6,5};
		int b[]= {4,4,9,6,9,90};
		int count=a.length;
		if(count<b.length) {
			count=b.length;
		}
		for(int i=0;i<count;i++) {
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}	
		}
	}
}
