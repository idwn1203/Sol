package Sol;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Subject {
	private SimpleStringProperty name;
	private SimpleIntegerProperty goal;
	private SimpleIntegerProperty doing;
	private SimpleStringProperty range;
	private SimpleStringProperty day;
	
	public Subject() {
		this.name = new SimpleStringProperty();
//		this.goal = new SimpleIntegerProperty();
//		this.doing = new SimpleIntegerProperty();
		this.range = new SimpleStringProperty();
		this.day = new SimpleStringProperty();
		
	}
	public Subject(String name, String range, String day) {
		this.name = new SimpleStringProperty(name);
//		this.goal = new SimpleIntegerProperty(goal);
//		this.doing = new SimpleIntegerProperty(doing);
		this.range = new SimpleStringProperty(range);
		this.day = new SimpleStringProperty(day);
	}
	
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	public int getGoal() {
		return goal.get();
	}
	public void setGoal(int goal) {
		this.goal.set(goal);;
	}
	public int getDoing() {
		return doing.get();
	}
	public void setDoing(int doing) {
		this.doing.set(doing);;
	}
}
