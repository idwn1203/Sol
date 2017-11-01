package afe;
import java.util.*;

public class MemberTest {
	public static void main (String[] argv) {
		
	List<Member> mlist= new ArrayList();
	mlist.add(new Member(3,6));
	mlist.add(new Member(5,51));
	mlist.add(new Member(5,13));
	
	for(Member s: mlist) {
		if(s.getSum() >10 ) {
			System.out.println("getSum이10 보다 큰경우"+" ("+s.data1 + " " + s.data2+")");
			}
		}
	}
}
