
public class Student {
	private int rollNo;
	private String name;
	static int count=0;
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
		count++;
	}
	
	public void display() {
		System.out.println("student details are = "+rollNo +" name = "+name);
		
	}
	static {
		System.out.println("static block invoked");
		count=63;
	}
	public static int getCount() {
		return count;
	}
	
	static {
	}
	public static void main(String[] args) {
		System.out.println("inside main method ");
		Student s1=  new Student(1, " rahul");
		s1.display();
		Student s2 = new Student(2, " rohan");
		s2.display();
		Student s3 = new Student(3, " priyanka");
		s3.display();
		
		int count= Student.getCount();
		System.out.println("student count = "+count);
	}
	}
