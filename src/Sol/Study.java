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
		System.out.println("몇시간동안 공부할 꺼야?");
		//int S1 = scanner.nextInt();
		//this.goal=S1;
		this.CT=(CTH*60)+CTM;
	}
	
	
	public void Doing() {
		
		this.studyTime = studyTime;
		
		
		
		if (studyTime ==goal)
		{
			System.out.println("목표 공부량을 다 채웠습니다.");
		}
		
				
		
	}
	

	
	
	public int getGoal() {
		return goal;
	}
	
	
}
