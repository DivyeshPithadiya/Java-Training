package keywords.thisKeyword;

class Stud {
	
	String name;
	
	Stud getStudent(String name) {
		this.name=name;
		return this;
	}
	
	void display() {
		System.out.println(this.name);
	}
}


public class thisAsReturn {

	public static void main(String[] args) {
		Stud s=new Stud();
		Stud detail=s.getStudent("Divyesh");
		detail.display();
	}
	
}
