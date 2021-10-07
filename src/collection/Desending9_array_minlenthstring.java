//Wap to print the minimum length in string array
package collection;



public class Desending9_array_minlenthstring {

	public static void main(String[] args) {
		String a[]= {"bye","hy","p","mango","tyss","change"};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i].length()>a[j].length()) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
			System.out.print(a[0]);
		}
	

}
