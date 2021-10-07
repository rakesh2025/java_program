//Wap to print all the maximum length in string array
package collection;



public class maxstringlength11_array {

	public static void main(String[] args) {
		String a[]= {"bye","hy","p","mango","tyss","happy"};
		String maxString=a[0];
		for (int i=0;i<a.length;i++) {
			if(maxString.length()<a[i].length()) {
				maxString=a[i];
			}
		}
		
		for(int j=0;j<a.length;j++) {
			if(maxString.length()==a[j].length()) {
				System.out.println(a[j]+" ");
			}
		}
		}
	

}
