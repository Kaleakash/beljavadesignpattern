abstract class Greeting {
	private static Greeting greet;

int time;//(5-11)->Morning (12-16)->Afternoon (17-20)-->Evening (21-24/0-4) -->Night
	
public abstract void greet();	
	public void setTime(int t) {
		if(t>=0 && t <=24) {
			
			time = t;
			if(t>=5 && t <=11) {
			greet = new Morning();
			}
			if(t>=12 && t <=16) {
			greet = new Afternoon();
			}
			if(t>=17 && t <=20) {
			greet = new Evening();
			}
			if((t>=20 && t <=24) || (t>=0 && t <=4)) {
			greet = new Night();
			}
			greet.greet();
		}else {
			System.out.println("Invalid Time");	
		}
	}
	public static Greeting getObject() {
		greet = new Night();
		return greet;
	}
}
class Morning extends Greeting {
	public void greet() {
		System.out.println("Good Morning");
	}
}
class Afternoon extends Greeting {
	public void greet() {
		System.out.println("Good Afternnoon");
	}
}
class Evening extends Greeting {
	public void greet() {
		System.out.println("Good Evening");
	}
}
class Night extends Greeting {
	public void greet() {
		System.out.println("Good Neight");
	}
}
public class StateTest {
	public static void main(String args[]) {
	Greeting g1 = Greeting.getObject();
	g1.greet();	
	g1.setTime(6);
	g1.setTime(13);
	g1.setTime(18);
	g1.setTime(22);
	}
}






