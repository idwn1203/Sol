package Sol;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Schedule {
	private SimpleStringProperty name;
	private SimpleIntegerProperty day;

	public Schedule() {
		this.name = new SimpleStringProperty();
		this.day = new SimpleIntegerProperty();
	}

	public Schedule(String name,int day) {
		this.name = new SimpleStringProperty(name);
		this.day = new SimpleIntegerProperty(day);
	}
	public Schedule(String name) {
		this.name = new SimpleStringProperty(name);
	}

	public int getDay() {
		return day.get();
	}
	public void setDay(int day) {
		this.day.set(day);
	}
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}

}
