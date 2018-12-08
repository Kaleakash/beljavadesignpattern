interface Shape {
	public void draw();
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Draw Circle");
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Draw Rectnagle");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Draw Square");
	}
}	
class ShapeFactory {
	public static Shape getShape(String shapeType){
      	if(shapeType == null){
         	return null;
      	}     
      	if(shapeType.equalsIgnoreCase("CIRCLE")){
         	return new Circle();
	} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         	return new Rectangle();
	} else if(shapeType.equalsIgnoreCase("SQUARE")){
         	return new Square();
      	}
	return null;
   	}
}
public class FactoryMethod {
	public static void main(String args[]) {
	Shape ss = ShapeFactory.getShape(args[0]);
	ss.draw();
	}
}