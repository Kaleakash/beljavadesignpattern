import java.util.*;

interface Subject {
	void register(Observer observer);
	 void remove(Observer observer);
	 void notifyRespectedObserver(String msg);
}
interface Observer {
	 public void update(String msg);
	 public String write(String msg);
	 public String getName();
}
class Console implements Subject{
	List<Observer> memberList;
	public Console() {
		// TODO Auto-generated constructor stub
		memberList = new ArrayList<>();
	}
	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		memberList.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		memberList.remove(observer);
	}

	@Override
	public void notifyRespectedObserver(String msg) {
		// TODO Auto-generated method stub
		for(Observer observer:memberList ){
		observer.update(observer.getName()+" - > "+msg);
		}
	}

}
class GroupMember implements Observer{

	private String name;
	public GroupMember(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Updated "+msg);
	}

	@Override
	public String write(String msg) {
		// TODO Auto-generated method stub
		return this.name+" @"+msg;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class ObserverDemo {
	public static void main(String args[]) {
		Console con = new Console();
		Observer member1 = new GroupMember("Raj");
		Observer member2 = new GroupMember("Seeta");
		Observer member3 = new GroupMember("Ajay");
		Observer member4 = new GroupMember("Ramesh");
		con.register(member1);
		con.register(member2);
		con.register(member3);
		con.register(member4);
		String text = member1.write("Hi Every One");
		con.notifyRespectedObserver(text);		
	}
}