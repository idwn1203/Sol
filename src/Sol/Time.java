package Sol;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Time extends Schedule {
	private SimpleIntegerProperty goal;

	public Time(String name,int goal) {
	super(name);
	this.goal = new SimpleIntegerProperty(goal);
	}

	public int getGoal() {
		return goal.get();
	}

	public void setGoal(int goal) {
		this.goal.set(goal);
	}
}
