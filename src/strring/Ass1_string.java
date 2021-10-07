//input:-welcome to tyss company
//output=company to tyss welcome
package strring;



public class Ass1_string {

	public static void main(String[] args) {
     String s="Welcome to TYSS company";
     String[] sen = s.split(" ");
     //LinkedList<String> l=new LinkedList<String>();
    String temp = sen[0];
    sen[0] = sen[sen.length-1];
    sen[sen.length-1]=temp;
    for (String str : sen) {
    	 System.out.print(str+" ");
	}
   
	}

}
