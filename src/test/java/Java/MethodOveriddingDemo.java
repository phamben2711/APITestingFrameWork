package Java;

public class MethodOveriddingDemo {
public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		//creating object of Base class Shape
	    Shape obj ;
	    obj=new Shape();
	    obj.draw();
	    //initiating object with subclasses
	    obj=new Square();
	    obj.draw();
	    obj=new Circle();
	    obj.draw();
	    obj=new Triangle();
	    obj.draw();
	

}
}
	class Shape
	{
	  void draw()
	  {
	    System.out.println("Drawing Shapes...");
	  }
	}
	class Square extends Shape
	{
	  //Overriding method of base class with different implementation
	  void draw()
	  {
	    System.out.println("Drawing Square");
	  }
	}
	class Circle extends Shape
	{
	  //Overriding method of base class with different implementation
	  void draw()
	  {
	    System.out.println("Drawing Circle");
	  }
	}
	class Triangle extends Shape
	{
	  //Overriding method of base class with different implementation
	  void draw()
	  {
	    System.out.println("Drawing Triangle");
	  }
	}

	

