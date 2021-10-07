//Wap to print all the minimum length in string array
package collection;



public class minstringlength12_array2 {

	public static void main(String[] args) {
		String a[]= {"bye","hy","p","mango","tyss","happy","q"};
		String minString=a[0];
		for (int i=0;i<a.length;i++) {
			if(minString.length()>a[i].length()) {
				minString=a[i];
			}
		}
		
		for(int j=0;j<a.length;j++) {
			if(minString.length()==a[j].length()) {
				System.out.println(a[j]+" ");
			}
		}
		}
	

}
