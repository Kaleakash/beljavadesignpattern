class Emp {
	private int id;
	private static final Emp INSTANCE = new Emp();
	private Emp(){}

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
	return id;
	}
	public static Emp getInstance() {
	return INSTANCE;
	}
}
public class SingletonEager {
	public static void main(String args[]) {
	Emp e1 = Emp.getInstance();
	Emp e2 = Emp.getInstance();
	e1.setId(10);	
	e2.setId(20);
	System.out.println(e1.getId());
	System.out.println(e2.getId());
	}
}