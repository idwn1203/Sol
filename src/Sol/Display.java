package Sol;


public class Display {

	Display(){
		
	}
	
	public void MainMenu() {

		System.out.println("---------------------------");
		System.out.println("1.Display Schedule List");						
		System.out.println("2.ADD Schedule");
		System.out.println("3.Exit");
		System.out.println("---------------------------");
		System.out.println("What do you want to do?");
		System.out.println("---------------------------");

	}
	
	public void DPSL(String A,int a,int a1,int a2,int a3) {
		
		System.out.println("---------------------------");				
		System.out.println("과목 : "+"시험범위는"+a+"부터"+a1+"까지이고 시험일자는"+a2+" 월"+a3+" 일입니다.");
		System.out.println("---------------------------");

	}
	public void TA(int a,int b) {
		System.out.println("시험범위는"+a+"부터"+b+"까지");				
	

	}
	public void ADSL() {
		System.out.println("---------------------------");				
		System.out.println("과목입력");
		System.out.println("날짜 입력");
		System.out.println("---------------------------");

	}	
	
	
}
