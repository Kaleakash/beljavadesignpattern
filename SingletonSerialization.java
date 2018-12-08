import java.io.*;
class Emp implements Serializable{
	long sid = 12343243242143l;
	private int id;
	String name;
	private static final Emp INSTANCE = new Emp();
	private Emp(){}

	public void setId(int id) {
		this.id=id;
	}
	 protected Object readResolve() {
       	 return INSTANCE;
   	 }
	public int getId() {
	return id;
	}
	public static Emp getInstance() {
	return INSTANCE;
	}
}
public class SingletonSerialization {
	static Emp emp1 = Emp.getInstance();
	public static void main(String args[]) {
	try {
	/*emp1.setId(10);
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));
	oos.writeObject(emp1);
	oos.close();
	emp1.setId(20);*/
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));
	Emp emp2 =(Emp)ois.readObject();
	//System.out.println(emp1.getId());
	System.out.println(emp2.getId());
	System.out.println(emp2.name);	
	}catch(Exception e) {
	System.out.println(e);
	}
	}
}