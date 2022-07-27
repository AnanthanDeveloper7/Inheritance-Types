//METHOD OVERLOADING
class parent
{
	void displayName()																// 	same method name
	{
		System.out.println(" this is parent class");								// same parameter
	}
}
class Child extends parent
{
	void displayName()
	{
		System.out.println(" this is child class");
		super.displayName();										// super keyword is used access the method from the parent class
	}
}
public class Methodoverrding 
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.displayName();
	}
}
