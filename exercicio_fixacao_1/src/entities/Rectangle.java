package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		
		return width * height;
	}
	
	public double perimeter() {
		
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		double area = (Math.pow(width,2.0)) + (Math.pow(height,2.0 )) ;
		return Math.sqrt(area);		
	}
	public String toString(){
		return "Area: "+String.format("%.2f",area())
			+ ", Perimeter: "+ String.format("%.2f",perimeter())
			+", Diagonal: "+String.format("%.2f",diagonal()); 
	}
}
