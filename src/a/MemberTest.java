package a;
import java.util.ArrayList;
import java.util.List;
public class MemberTest {

	public static void main(String[] args) {
		Member member =new Member("kim",1,2);
		//member.setdata1(5);
		//member.setdata2(3);
		System.out.println("getter�Լ� �� Data1�� "+(member.getData1()+3));
		System.out.println("getter�Լ� �� Data2�� "+(member.getData2()+3));
		System.out.println("getDouble�Լ� �� Data�� "+member.getSum());

		/*
		List<Member> mlist=new ArrayList();
		mlist.add(new Member("kim",5,23));
		*/
	}
}
