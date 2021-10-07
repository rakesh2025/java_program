package collection;

public class Prctice {

	public static void main(String[] args) {
	
			int a[]={1,4,76,86,98};
			int count=0;
			for(int i=0;i<a.length;i++)
			{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j]){
			count=a[i];
			a[i]=a[j];
			a[j]=count;
			}
			}
			}
			for(int i=0;i<a.length;i++)
			{
			System.out.print(a[i]+" ");
			

	}

}
}
