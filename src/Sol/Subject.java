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
		System.out.print("과목을 입력하세요");
		String S1 = scanner.next();
		this.name=S1;
		System.out.println("시험 범위는?");
		System.out.print("몇 단원부터?");
		int S = scanner.nextInt();
		this.TRS=S;
		System.out.print("몇 단원까지?");
		S = scanner.nextInt();
		this.TRE=S;
		System.out.println("시험날짜는?");
		System.out.print("몇월?");
		S = scanner.nextInt();
		this.TM=S;
		System.out.print("몇일??");
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
