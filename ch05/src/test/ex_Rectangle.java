package test;

public class ex_Rectangle {
	
	private double width;
	private double height;
	
	public ex_Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getCircumference() {
		return (this.width + this.height)*2;
	}
	
	public static void main(String[] args) {
		
		ex_Rectangle rc = new ex_Rectangle(3.82, 8.65);
		
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
		
	}

}
