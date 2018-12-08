import java.util.*;
interface Internet {
	public void connectTo(String host) throws Exception;
}
class RealInternet implements Internet {
	public void connectTo(String host) throws Exception{
		System.out.println("Conneting to "+host);
	}
}
class InternetProxy implements Internet {
	private Internet internet = new RealInternet();;
	private static List<String> restrictSite;
	static {
		restrictSite = new ArrayList<>();
		restrictSite.add("abc.com");
		restrictSite.add("bad.com");
		restrictSite.add("adult.com");	
	}
	public void connectTo(String host) throws Exception{
		if(!restrictSite.contains(host.toLowerCase())){
			internet.connectTo(host);
		}
		throw new Exception("Company restricted this site view");
		
	}	
}
public class ProxyDesignTest {
	public static void main(String args[]) {
	Internet intConn = new InternetProxy();
		try{
		intConn.connectTo("java.com");
		intConn.connectTo("bad.com");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}