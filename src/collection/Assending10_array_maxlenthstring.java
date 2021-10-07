//Wap to print the maximum length in string array
package collection;



public class Assending10_array_maxlenthstring {

	public static void main(String[] args) {
		String a[]= {"bye","hy","p","mango","tyss"};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i].length()<a[j].length()) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
			System.out.print(a[0]);
		}
	

}
