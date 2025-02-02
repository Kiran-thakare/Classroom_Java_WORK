package inheritance_constructor;

class A{
	protected int a;
	String name="A class";
	
	
	public A(int a) {
		
		this.a = a;
		
	}


	void showA() {
		System.out.println("Value of a:"+a);
	}
}
class B extends A{
	private int b=0;
	String name="B is Class";
	
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	
	void showB() {
		System.out.println("Value of B:"+b);
		
	}
	void sum() {
		System.out.println("The sum of a and b:"+(a+b));
	}
	
	void showName() {
		System.out.println("NameA :"+super.name);
		System.out.println("NameB :"+name);
	}

}
public class JavaInheritanceConstructor {
    
	public static void main(String[] args) {
		
		B b1=new B(344, 12);
		b1.showA();
		b1.showB();
		b1.sum();
		b1.showName();
	}
}
