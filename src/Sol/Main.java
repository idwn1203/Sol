package Sol;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Subject subject = new Subject();
		Study study =new Study();
		Scanner scanner = new Scanner(System.in);
		Calendar cal  = Calendar.getInstance();


		
		


		while (true) {
			System.out.println(cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DAY_OF_MONTH)+"일");
			System.out.println("현재시간 : "+cal.get(Calendar.HOUR)+"시"+cal.get(Calendar.MINUTE)+"분");
			display.MainMenu();
			System.out.println("메뉴를 선택하시오");
			int l = scanner.nextInt();
			int menu = l;

			switch (menu) {
			case 1:
				display.DPSL(subject.getName(), 
						subject.getTRS(),
						subject.getTRE(),
						subject.getMonth(), 
						subject.getDay());
				break;
			case 2:
				subject.setData();
				break;
			case 3:
				
				break;
			}
			
			if (menu == 4)
				return;

		}

	}
}
