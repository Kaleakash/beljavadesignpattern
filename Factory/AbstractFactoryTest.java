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
interface Color {
	void fill();
}	
class Red implements Color {
	public void fill() {
		System.out.println("Red color fill");
	}
}
class Green implements Color {
	public void fill() {	
		System.out.println("Green color fill");
	}
}
abstract class AbstractFactory{
	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);
}
class ShapeFactory extends AbstractFactory{
	public Color getColor(String name) {
	return null;
	}
	public Shape getShape(String shapeType){
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
class ColorFactory extends AbstractFactory{
	public Color getColor(String name) {
		if(name.equalsIgnoreCase("Red")) {
		return new Red();
		}else if(name.equalsIgnoreCase("Green")) {
		return new Green();
		}else {
		return null;
		}
	}
	public Shape getShape(String shapeType){
	return null;
   	}
}
class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}else {
			return null;
		}
	}
}
public class AbstractFactoryTest {
	public static void main(String args[]) {
	AbstractFactory factory1 = FactoryProducer.getFactory("Shape");
	Shape s1 = factory1.getShape("Circle");
	s1.draw();
	AbstractFactory factory2 = FactoryProducer.getFactory("Color");		
	Color c1 = factory2.getColor("Red");
	c1.fill();		
	}
	
}