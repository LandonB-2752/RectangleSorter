/*/LandonBarden's Work/*/
public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	
	//Default
	public Rectangle() {
		length = 1;
		width = 1;
		setArea(length, width);
	}
	
	//Parameterized
	public Rectangle(double l, double w) {
		length = l;
		width = w;
		setArea(l, w);
	}
	
	//Mutators
	public void setLength(double l) {
		this.length = l;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public void setArea(double l, double w) {
		this.area = (l*w);
	}
	
	//Accessors
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return area;
	}
	
	public String toString() {
		String rectangleOutput = ("Length: "+getLength()+"\nWidth: "+getWidth()+"\nArea: "+getArea());
		return rectangleOutput;
	}
	
	public String toAreaString() { //Outputs only the area of the rectangle
		String areaOutput = ("Area: "+getArea());
		return areaOutput;
	}

}
