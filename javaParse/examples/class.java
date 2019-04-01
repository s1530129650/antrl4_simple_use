package student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_a one_student = new Student_a("a",18);
		System.out.println("name:"+one_student.getName());
				
	}

}


class Student_a {
	   private String name;
	   private int age;
	   public Student_a() {}
	   public Student_a(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	   public String getName() {
	        return name;
	    }
	
	}




   