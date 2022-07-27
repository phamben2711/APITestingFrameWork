package Java;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rectangle = new Rectangle(); // Create a Rectangle object
		    Square square=new Square(); // Create a Square object
		    //calling methods of class Rectangle
		    rectangle.getName();
		    rectangle.getNumberOfSides();
		    rectangle.getArea();
		    rectangle.getPerimeter();
		    // calling methods of class Square
		    square.getName();
		    square.getNumberOfSides();
		    square.getArea();
		    square.getPerimeter();
		  }
	}


interface Polygon
{
  //declaring variables of the interface
  public static final int side = 5,length = 4,breadth = 8;
  //declaring interface methods(without a method body)
  public void getName();
  public void getNumberOfSides();
  public void getArea();
  public void getPerimeter();
}
class Rectangle implements Polygon
{
  public void getName()
  {
    // The body of getName() is provided here
    System.out.println("The name of the Polygon is: Rectangle");
  }
  public void getNumberOfSides()
  {
    // The body of getNumberOfSides() is provided here
    System.out.println("There are 4 sides in a Rectangle");
  }
  public void getArea()
  {
    // The body of getArea() is provided here
    System.out.println("The Area of Rectangle is: " +length*breadth);
  }
  public void getPerimeter()
  {
    // The body of getPerimeter() is provided here
    System.out.println("The Perimeter of Rectangle is: " +2*(length + breadth));
  }
}
//Square class "implements" the Polygon interface
class Square implements Polygon
{
  public void getName()
  {
    // The body of getName() is provided here
    System.out.println("\nThe name of the Polygon is: Square");
  }
  public void getNumberOfSides()
  {
    // The body of getNumberOfSides() is provided here
    System.out.println("There are 4 sides in a Rectangle");
  }
  public void getArea()
  {
    // The body of getArea() is provided here
    System.out.println("The Area of Square is: " +side * side);
  }
  public void getPerimeter()
  {
    // The body of getPerimeter() is provided here
    System.out.println("The Perimeter of Square is: " +4*side);
  }
}