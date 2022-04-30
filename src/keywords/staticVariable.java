package keywords;

class Student {
	
	static String school = "JDT High School";
	static int schoolCode=1212;
	
	Student(String name, String surname) {
		System.out.println("Name: "+name);
		System.out.println("Surname: "+surname);
	}
}

public class staticVariable {
	public static void main(String[] args) {
		
		Student s1=new Student("Divyesh", "Pithadiya");
		System.out.println("School name: "+Student.school);
		System.out.println("Schoold code: "+Student.schoolCode);
		
		Student s2=new Student("Mahek", "Shah");
		System.out.println("School name: "+Student.school);
		System.out.println("Schoold code: "+Student.schoolCode);
	
		
	}
}
