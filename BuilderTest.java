class User {
	//For immutable instance varaible must be final 
	final String firstName;	//required
	final String lastName;	//required
	final int age;		//optional 	
	final String phone;		//optional 
	final String address;		//optional 
	//only getter method no setter method
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	//static builder class 
	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		public UserBuilder(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName=lastName;
		}
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		//return the finally constructed User object
		public User build(){
			User user = new User(this);
			return user;		
		}
	}
	public String toString() {
return "First Name "+this.firstName+"Last Name "+this.lastName+" Age "+this.age +"Phone "+this.phone+" Address"+this.address;
	}
}
class BuilderTest {
	public static void main(String args[]) {
	User user1 = new User.UserBuilder("Samikash","Kale").build();
	System.out.println(user1);
	User user2 = new User.UserBuilder("Shilpa","Kale").age(24).build();
	System.out.println(user2);
	User user3 = new User.UserBuilder("Vikash","Kale").age(24).address("Nandini Layout").build();
	System.out.println(user3);
	User user4 = new User.UserBuilder("Akash","Kale").age(33).address("Nandini Layout").phone("9900103077").build();
	System.out.println(user4);
	}
}