class Apple {
	public void taste() {
		System.out.println("Apple is sweet");
	}
}
class Orange {
	public void taste() {
		System.out.println("Orange is sour");
	}
}
class FruitFactory {
	public Apple makeApple() {
	return new Apple();    	
  	}
	public Orange makeOrange() {
	return new Orange();    	
  	}
}
public class SimpleFactory {
	public static void main(String args[]) {
	FruitFactory ff = new FruitFactory();
	Apple app = ff.makeApple();	app.taste();
	Orange org = ff.makeOrange();	org.taste();
	}
}