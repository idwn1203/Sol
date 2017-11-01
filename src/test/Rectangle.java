package test;

public class Rectangle extends Shape {
	private String name;
	
	Rectangle(String name,int x,int y){
		this.name =name;
		super(x);
		super(y);
	}
	
	public void area() {
		
	}
}
