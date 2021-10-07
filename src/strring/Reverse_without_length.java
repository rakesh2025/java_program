package strring;

public class Reverse_without_length {

	public static void main(String[] args) {
		String s="INDIA";
	   	 String rev="";
		int count=0;
		char c[]=s.toCharArray();
		for(char i:c) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			
			
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
	}
}
