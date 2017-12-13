package Sol;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Score extends Schedule {
	private SimpleIntegerProperty AssignScore;
	private SimpleDoubleProperty GetScore;
	private SimpleIntegerProperty SubjectGetScore;
	private SimpleIntegerProperty Year;
	private SimpleIntegerProperty Grade;

	public Score(String name, int AssignScore, double GetScore, int SubjectGetScore, int Year, int Grade) {
		super(name);
		this.AssignScore = new SimpleIntegerProperty(AssignScore);
		this.GetScore = new SimpleDoubleProperty(GetScore);
		this.SubjectGetScore = new SimpleIntegerProperty(SubjectGetScore);
		this.Year = new SimpleIntegerProperty(Year);
		this.Grade = new SimpleIntegerProperty(Grade);
	}

	public void setAssignScore(int AssignScore) {
		this.AssignScore.set(AssignScore);
	}

	public int getAssignScore() {
		return AssignScore.get();
	}

	public void setGetScore(double GetScore) {
		this.GetScore.set(GetScore);
	}

	public double getGetScore() {
		return GetScore.get();

	}
	public void setSubjectGetScore(int SubjectGetScore) {
		this.SubjectGetScore.set(SubjectGetScore);
	}

	public int getSubjectGetScore() {
		return SubjectGetScore.get();
	}

	
	public void setYear(int Year) {
		this.Year.set(Year);
	}

	public int getYear() {
		return Year.get();
	}

	public void setGrade(int Grade) {
		this.Grade.set(Grade);
	}

	public int getGrade() {
		return Grade.get();
	}

}
