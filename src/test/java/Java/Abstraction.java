package Java;

public class Abstraction {
	 public static void main(String[] args)
	  {
	    GeometricShapes shapeObject1 = new Circle("Circle", 6.5);
	    System.out.println(shapeObject1.toString());
	    GeometricShapes shapeObject2 = new Square("Rectangle",8);
	    System.out.println(shapeObject2.toString());
	  }
}
	abstract class GeometricShapes
	{
	  String nameOfShape;
	  //abstract methods
	  abstract double calculateArea();
	  public abstract String toString();
	  //constructor
	  public GeometricShapes(String nameOfShape)
	  {
	    System.out.println("Inside the Constructor of GeometricShapes class ");
	    this.nameOfShape = nameOfShape;
	  }
	  //non-abstract method
	  public String getNameOfShape()
	  {
	    return nameOfShape;
	  }
	}
	class Circle extends GeometricShapes
	{
	  double radius;
	  public Circle(String nameOfShape,double radius)
	  {
	    super(nameOfShape);
	    System.out.println("Inside the Constructor of Circle class ");
	    this.radius = radius;
	  }
	  //implementing the methods
	  @Override
	  double calculateArea()
	  {
	    return Math.PI * Math.pow(radius, 2);
	  }
	  @Override
	  public String toString()
	  {
	    return "Name of the shape is " + super.nameOfShape +
	        " and its area is: " + calculateArea();
	  }
	}
	class Square extends GeometricShapes
	{
	  double length;
	  public Square(String nameOfShape,double length)
	  {
	    //calling Shape constructor
	    super(nameOfShape);
	    System.out.println("Inside the Constructor of Square class ");
	    this.length = length;
	  }
	  //implementing the methods
	  @Override
	  double calculateArea()
	  {
	    return length * length;
	  }
	  @Override
	  public String toString()
	  {
	    return "Name of the Shape is " + super.nameOfShape +
	        " and its area is: " + calculateArea();
	  }
}
