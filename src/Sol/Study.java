package Sol;
import java.util.Scanner;
public class Study {

	int goal;
	int studyTime;
	int CTH,CTM;//Current Time
	int CT;
	Study(){
		
	}
	
	public void setTime(int CTH,int CTM) {
		this.CTH=CTH;
		this.CTM=CTM;
		this.CT=(CTH*60)+CTM;
	}
	public void setGoal() {
		System.out.println("��ð����� ������ ����?");
		//int S1 = scanner.nextInt();
		//this.goal=S1;
		this.CT=(CTH*60)+CTM;
	}
	
	
	public void Doing() {
		
		this.studyTime = studyTime;
		
		
		
		if (studyTime ==goal)
		{
			System.out.println("��ǥ ���η��� �� ä�����ϴ�.");
		}
		
				
		
	}
	

	
	
	public int getGoal() {
		return goal;
	}
	
	
}
