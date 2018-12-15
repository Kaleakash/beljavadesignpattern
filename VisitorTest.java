abstract class ComputerPart {
	int price;
	public abstract void accept(ComputerPartVisitor cpv);
}
class Keyboard extends ComputerPart {
	Keyboard(int p) {
		price = p;
	}
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);
	}
}
class Mouse extends ComputerPart {
	Mouse(int p) {
		price = p;
	}
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);
	}
}
class Monitor extends ComputerPart {
	Monitor(int p) {
		price = p;
	}
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);
	}
}
class Motherboard extends ComputerPart {
	Motherboard(int p) {
		price = p;
	}
	public void accept(ComputerPartVisitor cpv) {
		cpv.visit(this);
	}
}
class Computer extends ComputerPart{
	ComputerPart cpart[];
	Computer() {
	cpart=new ComputerPart[]{new Mouse(100),new Monitor(5000),new Keyboard(450),new Motherboard(8000)};
	}
	public void accept(ComputerPartVisitor cpv) {
		for(int i=0;i<cpart.length;i++){
			cpart[i].accept(cpv);
		}
		cpv.visit(this);
	}	
}
interface ComputerPartVisitor {
	public void visit(Computer cm);
	public void visit(Mouse ms);
	public void visit(Monitor mn);
	public void visit(Keyboard ky);
	public void visit(Motherboard mb);
}
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
	static int total;
	public void visit(Computer cm){
		System.out.println("Computer Accessories");
	}
	public void visit(Mouse ms){
		System.out.println("Mouse available");
		total += ms.price;
	}
	public void visit(Monitor mn){
		System.out.println("Monitor available");
		total += mn.price;
	}
	public void visit(Keyboard ky){
		System.out.println("Keyboard available");
		total += ky.price;
	}
	public void visit(Motherboard mb){
		System.out.println("Mother board available");
		total += mb.price;
	}
}
class VisitorTest {	
	public static void main(String args[]) {
	Computer com = new Computer();
	com.accept(new ComputerPartDisplayVisitor());	
	System.out.println("Total Price "+ComputerPartDisplayVisitor.total);
	}
}