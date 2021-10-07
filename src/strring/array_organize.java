// input =1,0,0,3,0,7,0,5,1,0,0,8 output:-1,3,7,5,1,8,0,0,0,0,0,0
package strring;

public class array_organize {

public static void main(String[] args) {
   int a[]= {1,0,0,3,0,7,0,5,1,0,0,8};
   for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			
			if (a[i]==0) {
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
