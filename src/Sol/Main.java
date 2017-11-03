package Sol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Subject subject = new Subject();
		Scanner scanner = new Scanner(System.in);
		int menu = 0, s = 0, e = 0;

		display.MainMenu();

		while (true) {

			System.out.println("메뉴를 선택하시오");
			int l = scanner.nextInt();
			menu = l;

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
			}
			
			if (menu == 3)
				return;

		}

	}
}
