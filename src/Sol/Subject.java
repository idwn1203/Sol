package Sol;
import java.util.Scanner;


public class Subject extends Test {
	String name;
	int TRS;
	int TRE;
	int MS;//Middle Score
	int FS;//Final Score
	Subject() {

	}
Scanner scanner =new Scanner(System.in);
	

	
	public void setData() {
		System.out.print("������ �Է��ϼ���");
		String S1 = scanner.next();
		this.name=S1;
		System.out.println("���� ������?");
		System.out.print("�� �ܿ�����?");
		int S = scanner.nextInt();
		this.TRS=S;
		System.out.print("�� �ܿ�����?");
		S = scanner.nextInt();
		this.TRE=S;
		System.out.println("���賯¥��?");
		System.out.print("���?");
		S = scanner.nextInt();
		this.TM=S;
		System.out.print("����??");
		S = scanner.nextInt();
		this.TD=S;
	}
	
	public String getName() {
		return name;
	}
	public int getDay() {
		return TD;
	}

	public int getMonth() {

		return TM;
	}

	public int getTRS() {
		return TRS;
	}

	public int getTRE() {
		return TRE;
	}
}
