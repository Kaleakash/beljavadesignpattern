import java.util.*;
interface Internet {
	public void connectTo(String host) throws Exception;
}
class RealInternet implements Internet{
	public void connectTo(String host) throws Exception {
	System.out.println("Connected to host "+host);
	}
}
class ProxyInternet implements Internet{
	Internet nn = new RealInternet();
	static List<String> listOfSite = new ArrayList();	
	static {
		listOfSite.add("abc.com");
		listOfSite.add("xyz.com");
	}
	public void connectTo(String host) throws Exception {
		if(!listOfSite.contains(host)){
			nn.connectTo(host);
		}else {
		throw new Exception("Company blocked these site");
		}
	}		
}
class ProxyTest {
	public static void main(String args[]) throws Exception{
	Internet nn = new ProxyInternet();
	nn.connectTo("abcd.com");
	}
}