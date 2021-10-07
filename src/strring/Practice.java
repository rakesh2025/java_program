package strring;

import java.util.HashSet;


public class Practice {

	public static void main(String[] args) {
		String s="rakesh is a is good is best";
		String[] ar=s.split(" ");
		HashSet<String> l=new HashSet<String>();
		for(int i=0;i<ar.length;i++) {
			l.add(ar[i]);
		}
		System.out.println(l);
		for(String d:l) {
			int count=0;
			for(int j=0;j<ar.length;j++) {
				if(d.equals(ar[j])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(d+":"+count);
			}

		}

	}
}



