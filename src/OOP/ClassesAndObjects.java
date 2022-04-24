package OOP;

class multi {
	int a = 10;
	int b = 20;
	void m()
	{
	 int multiply = a*b;
	 System.out.println("multiplication of a and b is:"+multiply);
	}
 
}



class ClassesAndObjects{

public static void main(String[] args)
{	
multi mt = new multi();
 mt.m();

}

}