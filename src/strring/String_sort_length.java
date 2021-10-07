//Wap to sort the string by length
package strring;



public class String_sort_length {

	public static void main(String[] args) {
		String a[]= {"dhit","radhakrishna","rakesh","sahba","dhir","dhit"};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i].length()>a[j].length()) {
					String temp=a[i];
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
