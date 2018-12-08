class Volt{
	private int volts;
	Volt(int volts) {
		this.volts = volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}
	public int getVolts() {
		return volts;
	}
}
class Socket {
	public Volt getVolts() {
		return new Volt(120);
	}
}
interface SocketAdapter {
	public Volt get120Volts();
	public Volt get12Volts();
	public Volt get3Volts();
}
class SocketAdapterImp implements SocketAdapter {
	private Socket ss = new Socket();
	public Volt get120Volts(){
		return ss.getVolts();
	}
	public Volt get12Volts(){
		Volt v = ss.getVolts();
		return new Volt(v.getVolts()/10);
	}
	public Volt get3Volts(){
		Volt v = ss.getVolts();
		return new Volt(v.getVolts()/40);
	}
}
public class AdapterTest {
	public static void main(String args[]) {
	SocketAdapter adapter = new SocketAdapterImp();
	Volt v1 = adapter.get120Volts();
	Volt v2 = adapter.get12Volts();
	Volt v3 = adapter.get3Volts();
	System.out.println(v1.getVolts());
	System.out.println(v2.getVolts());
	System.out.println(v3.getVolts());
	}
}