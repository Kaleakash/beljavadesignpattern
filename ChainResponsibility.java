class Complaint {
	private int count;
	private String name;
	Complaint(int count, String name){
		this.count = count;
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}
}
abstract class Staff {
	Staff stf;
	Staff(Staff stf) {
		this.stf = stf;
	}
	public abstract void handleComplaint(Complaint cpt);
}
class ClassTeacher extends Staff {
	ClassTeacher(Staff stf) {
		super(stf);
	}
	public void handleComplaint(Complaint cpt){
		if(cpt.getCount()<=5) {
System.out.println("Complaint handle by Class Teacher "+cpt.getName());
		}else {
		stf.handleComplaint(cpt);
		}
	}	
}
class VicePrincipal extends Staff {
	VicePrincipal(Staff stf) {
		super(stf);
	}
	public void handleComplaint(Complaint cpt){
		if(cpt.getCount()<=10) {
System.out.println("Complaint handle by Vice Principal "+cpt.getName());
		}else {
		stf.handleComplaint(cpt);
		}
	}	
}
class Principal extends Staff {
	Principal(Staff stf) {
		super(stf);
	}
	public void handleComplaint(Complaint cpt){
		if(cpt.getCount()<=15) {
System.out.println("Complaint handle by Principal "+cpt.getName());
		}else {
			try {
		stf.handleComplaint(cpt);
			}catch(Exception e){
		System.out.println("Student Terminated....");
			}
		}
	}	
}
class ChainResponsibility {
	public static void main(String args[]) {
	Staff ss = new ClassTeacher(new VicePrincipal(new Principal(null)));
	ss.handleComplaint(new Complaint(19,"Raj"));	
	}
}
