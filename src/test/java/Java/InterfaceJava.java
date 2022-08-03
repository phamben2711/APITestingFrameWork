package Java;



public class InterfaceJava {

	
	
	public interface Shape {
		 void draw();
	}
	public interface Coler{
		String getColor();
	}
	public class Rectangle implements Shape,Coler{

		@Override
		public String getColor() {
				
			return "red";
		}

		@Override
		public void draw() {
			System.out.println("Draw"+this.getColor()+"Rectangle");
			
			
		}
		
	}
}
