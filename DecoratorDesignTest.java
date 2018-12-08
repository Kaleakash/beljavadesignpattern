abstract class Sandwich {
	protected String description = "Sandwich"; 
	public String getDescription(){ return description; } 
	public abstract double price();
}
class WhiteBreadSandwich extends Sandwich {

	public WhiteBreadSandwich(String desc) {
		// TODO Auto-generated constructor stub
		description = desc;
	}
	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 60f;
	}

}
abstract class SandwichDecorator  extends Sandwich{
	@Override
    public abstract double price();

	
}
CheeseDecorator extends SandwichDecorator{
	Sandwich currentSandwich; 
	public CheeseDecorator(Sandwich sw){ 
		currentSandwich = sw; 
		} 
	@Override 
	public String getDescription(){ 
		return currentSandwich.getDescription() + ", with Cheese"; 
		} 
	@Override 
	public double price() { 
		return currentSandwich.price()+30; 
		}

	
}
class DecoratorDesignTest {
	public static void main(String args[]) {
	Sandwich mySandwich = new WhiteBreadSandwich("White bread Sandwich");
	System.out.println("Price "+mySandwich.price()+", "+mySandwich.getDescription());
		
	Sandwich mySandwichCheese = new CheeseDecorator(mySandwich);
	System.out.println("Price "+mySandwichCheese.price()+", "+mySandwichCheese.getDescription());

	}
}