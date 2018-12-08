class FruitFactory {
	public Apple makeApple() {
		return new Apple();
	}
	public Orange makeOrange() {
		return new Orange();
	}
	class Apple {
		public void purchase() {
			System.out.println("1 Kg Apple Purchase");
		}
	}
	class Orange {
		public void purchase() {
			System.out.println("2 Kg Orange Purchase");
		}
	}	
}
class Factory {
	public static void main(String args[]) {
	FruitFactory ff = new FruitFactory();
	FruitFactory.Apple apple=ff.makeApple();		
	apple.purchase();
	FruitFactory.Orange orange=ff.makeOrange();		
	orange.purchase();
	}
}