//ip:abc12@45xyz
//op;-abcxyz
//	1234
//	@%
package strring;




public class Ass2_string {

	public static void main(String[] args) {
		
	String ch="";
	String num="";
	String spl="";
String s="abc12@45xyz%";

for(int i=0;i<s.length();i++) {
	if(s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
		ch=ch+s.charAt(i);
	}else if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
		num=num+s.charAt(i);
	}else {
		spl=spl+s.charAt(i);
	}
	}
System.out.println(ch);
System.out.println(num);
System.out.println(spl);
}
}
