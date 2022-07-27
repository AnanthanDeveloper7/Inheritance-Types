class Parentmain										//HIERARCHICAL
{
	int a = 2;

}
 class Child1 extends Parentmain			//child 1 is inherit from parent class
 {
	 int b = 4;
 }
 class Child2 extends Parentmain			// child 2 is also inherit from parent class
 {
	 int c =6;
 }
 
 public class Parent
 {
	 public static void main(String[] args)
	 {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		System.out.println(c2.a);
		System.out.println(c1.a);
		
	}
 }