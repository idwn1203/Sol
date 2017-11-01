package a;
import java.util.ArrayList;
import java.util.List;
public class MemberTest {

	public static void main(String[] args) {
		Member member =new Member("kim",1,2);
		//member.setdata1(5);
		//member.setdata2(3);
		System.out.println("getter함수 쓴 Data1은 "+(member.getData1()+3));
		System.out.println("getter함수 쓴 Data2는 "+(member.getData2()+3));
		System.out.println("getDouble함수 쓴 Data는 "+member.getSum());

		/*
		List<Member> mlist=new ArrayList();
		mlist.add(new Member("kim",5,23));
		*/
	}
}
