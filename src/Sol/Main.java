package Sol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		TestData testData = new TestData();
		TestRange testRange = new TestRange();
		Subject subject = new Subject();
		Scanner scan = new Scanner(System.in);

		
		int menu = 0;
		display.Menu();
		subject.name = scan.nextLine();
		System.out.println(subject.name);

		
		/*
		 * switch(menu) {
		 * 
		 * case '1' : //System.out.println(TRS+"월 "+TRE+"일"); break; case '2' :
		 * //System.out.println(TRS+"단원부터  "+TRE+"단원까지"); break; case '3' :
		 * //System.out.println(TRS+"월 "+TRE+"일");
		 * 
		 * break;
		 * 
		 * }
		 */

	}
}
