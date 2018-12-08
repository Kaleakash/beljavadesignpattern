import java.util.*;
class Code {
	private String code;
	private String features;
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getFeatures() {
		return features;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
}
interface Platform {
	public void execute(Code code);
}
class CPlusPlatform implements Platform {
	CPlusPlatform() {
		System.out.println("CPlatform Object Created....");
	}
	public void execute(Code code){
		System.out.println(code.getCode() +" "+code.getFeatures());
	}
}
class JavaPlatform implements Platform{
	JavaPlatform() {
		System.out.println("JavaPlatform Object Created....");
	}
	public void execute(Code code){
		System.out.println(code.getCode() +" "+code.getFeatures());
	}
}
class DotNetPlatform implements Platform {
	DotNetPlatform() {
		System.out.println("DotNetPlatform Object Created....");
	}
	public void execute(Code code){
		System.out.println(code.getCode() +" "+code.getFeatures());
	}
}
class PlatformFactory {
	static HashMap<String,Platform> hm = new HashMap<String,Platform>();
	public  static Platform getPlatformInstance(String platformType) {
		Platform platform = hm.get(platformType);
		if(platform==null) {
			switch(platformType) {
		case "CPlus": platform = new CPlusPlatform();
					break;
				case "Java": platform = new JavaPlatform();
					break;
				case "DotNet":platform = new DotNetPlatform();
					break;
			}
		hm.put(platformType,platform);		
		}
		return platform;
	}
}
class FlyWeightTest {
	public static void main(String args[]) {
	Code c = new Code();
	c.setCode("C++ coding");
	c.setFeatures("Partial Object Oriented");
	Platform pp1 = PlatformFactory.getPlatformInstance("CPlus");		
	pp1.execute(c);
	Platform pp2 = PlatformFactory.getPlatformInstance("CPlus");		
	pp2.execute(c);
	Platform pp3 = PlatformFactory.getPlatformInstance("Java");
	c.setCode("Java coding");	
	c.setFeatures("Platform Independent");	
	pp3.execute(c);
	
	}
}
