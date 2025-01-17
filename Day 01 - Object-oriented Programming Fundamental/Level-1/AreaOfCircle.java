public class AreaOfCircle {
	public static void main(String[] args) {
		// Create an AreaOfCircleClass object
		AreaOfCircleClass circle1 = new AreaOfCircleClass();
		AreaOfCircleClass circle2 = new AreaOfCircleClass();

		// Set the radius using setter methods
		circle1.setRadius(4);
		circle2.setRadius(2);

		// Display details of each circle
		System.out.println("=== Circle 1 ===");
		circle1.displayDetails();
		System.out.println("\n=== Circle 2 ===");
		circle2.displayDetails();
	}
}

class AreaOfCircleClass {
	// Attribute for circle radius
	private double radius;

	// Default constructor
	public AreaOfCircleClass() {}

	// Setter method to set the radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Method to calculate the area of the circle
	public double calculateArea() {
		return (Math.PI * (radius * radius));
	}

	// Method to calculate the circumference of the circle
	public double calculateCircumference() {
		return (2 * Math.PI * radius);
	}

	// Method to display area and circumference of the circle
	public void displayDetails() {
		System.out.println("The Area of the Circle: " + calculateArea());
		System.out.println("The Circumference of the Circle: " + calculateCircumference());
	}
}
