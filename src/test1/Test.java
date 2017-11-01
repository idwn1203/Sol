package test1;

import java.util.Map;

import java.util.*;

public class Test {

	
	public static void main(String[] args) {
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(90, "A");
		map.put(80, "B");
		map.put(70, "C");
		
		
		Student student1 =new Student("홍길동",15,80);
		Student student2 =new Student("전인준",15,90);		
		Student student3 =new Student("아무개",14,80);
		Student student4 =new Student("클래스",15,70);
		
		Student[] student =new Student[4];
		student[0] =new Student("홍길동",15,80);
		student[1] =new Student("전인준",15,90);		
		student[2] =new Student("아무개",14,80);
		student[3] =new Student("클래스",15,70);
		
		for(Student s1 : student) {
		
		System.out.println(s1.year+"학번 "+s1.name+"은 "+s1.score+"점이고 "+map.get(s1.score)+"학점입니다.");
		
		}
		

		
	}
}
