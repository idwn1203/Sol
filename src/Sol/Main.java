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
			System.out.println(cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DAY_OF_MONTH)+"��");
			System.out.println("����ð� : "+cal.get(Calendar.HOUR)+"��"+cal.get(Calendar.MINUTE)+"��");
			display.MainMenu();
			System.out.println("�޴��� �����Ͻÿ�");
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
