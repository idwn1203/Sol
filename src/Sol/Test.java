package Sol;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Test extends Schedule {

	private SimpleStringProperty range;

	
	 public Test(String name,String range,int day) {
	 super(name,day);
	 this.range=new SimpleStringProperty(range);
	 }
	
	public String getRange() {
		return range.get();
	}
	public void setRange(String range) {
		this.range.set(range);
	}
}
