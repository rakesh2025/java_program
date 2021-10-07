package strring;

public class Reverse_String_with3rdvar {

	public static void main(String[] args) {
		String s="RAKESH";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
	}

}
