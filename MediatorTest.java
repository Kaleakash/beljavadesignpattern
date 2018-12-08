interface Mediator {
	public void registerRunway(Runway runway);
	public void registerFlight(Flight flight);
	public boolean isLandingOk();
	public void setLandingStatus(boolean status);
}
class ATCMediator implements Mediator {
	private Flight flight;
	private Runway runway;
	public boolean status;
	public void registerRunway(Runway runway){
		this.runway = runway;
	}
	public void registerFlight(Flight flight) {
		this.flight = flight;
	}
	public boolean isLandingOk(){
		return status;
	}
	public void setLandingStatus(boolean status){
		this.status = status;
	}
}
interface Command {	
	public void land();
}
class Flight implements Command {
	private Mediator mediator;
	Flight(Mediator mediator) {
		this.mediator = mediator;
	}
	public void land() {
		if(mediator.isLandingOk()) {
			System.out.println("Landing Done...");
			mediator.setLandingStatus(true);
		}else {
			System.out.println("Will wait to land....");
		}
	}
	public void getReady() {
		System.out.println("Getting Ready.....");
	}
}
class Runway implements Command {
	private Mediator mediator;
	Runway(Mediator mediator) {
		this.mediator = mediator;
	}
	public void land() {
		if(mediator.isLandingOk()){
		System.out.println("Landing permission is not granted....");
		mediator.setLandingStatus(false);
		}else{
		System.out.println("Landing permission is granted....");
		mediator.setLandingStatus(true);
		}
	}
}
public class MediatorTest {
	public static void main(String args[]) {
	Mediator mediator = new ATCMediator();
	Flight flight = new Flight(mediator);
	Runway runway = new Runway(mediator);
	flight.getReady();
	runway.land();
	flight.land();	
	}
}