package test1;

import java.util.Map;

import java.util.*;

public class Test {

	
	public static void main(String[] args) {
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(90, "A");
		map.put(80, "B");
		map.put(70, "C");
		
		
		Student student1 =new Student("ȫ�浿",15,80);
		Student student2 =new Student("������",15,90);		
		Student student3 =new Student("�ƹ���",14,80);
		Student student4 =new Student("Ŭ����",15,70);
		
		Student[] student =new Student[4];
		student[0] =new Student("ȫ�浿",15,80);
		student[1] =new Student("������",15,90);		
		student[2] =new Student("�ƹ���",14,80);
		student[3] =new Student("Ŭ����",15,70);
		
		for(Student s1 : student) {
		
		System.out.println(s1.year+"�й� "+s1.name+"�� "+s1.score+"���̰� "+map.get(s1.score)+"�����Դϴ�.");
		
		}
		

		
	}
}
