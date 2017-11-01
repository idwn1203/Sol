package a;

public class Member extends Member0 implements Summable{
	private int data1;
	private int data2;

	Member(String name,int data1,int data2){
		super(name);
		this.data1=data1;
		this.data2=data2;
	}

	public void setdata1(int data) {
		this.data1=data;
	}
	public void setdata2(int data) {
		this.data2=data;
	}
	public int getData1() {
		return data1;	
	}
	public int getData2() {
		return data2;
		
	}
	@Override
	public  int getSum() {
		return data1+data2;
	}	
	
}
