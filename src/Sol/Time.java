package Sol;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Time extends Schedule {
	private SimpleIntegerProperty goal;
	private SimpleIntegerProperty doing;

	public Time(String name, int range, int day) {
	
	}

	public int getGoal() {
		return goal.get();
	}

	public void setGoal(int goal) {
		this.goal.set(goal);
	}
	public int getDoing() {
		return doing.get();
	}

	public void setDoing(int doing) {
		this.doing.set(doing);
	}

}
