package keywords.thisKeyword;

class Student {
	
	String name;
	String surname;
	
	Student(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}
	
}

public class thisWithVariables {
	
	public static void main(String args[]) {
		
		Student s1= new Student("Rohan", "Patel");
		System.out.println(s1.name);
		System.out.println(s1.surname);
		
	}

}
