class Student implements Cloneable
{
	String name;
	int age;
	String std;
	String address;
	char grade;
	public String toString()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Standard : "+std);
		System.out.println("Grade : "+grade);
		System.out.println("Address : "+address);
		return ("---------------------------------");
	}
	public Student getDuplicate()
	{
		try
		{
			return (Student) super.clone();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
}
public class PrototypeDemoTest
{
	public static void main(String args[])
	{
		Student student = new Student();
		student.name = "Raju";
		student.age = 28;
		student.std = "3rd";
		student.grade = 'B';
		student.address = "Kormangala, Blore, Karnataka";

		System.out.println(student);

		Student s2 = student;
		Student s3 = student.getDuplicate();

		System.out.println(s2);
		System.out.println(s3);

		System.out.println(student.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}