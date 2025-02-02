package inheritance;

class Product{
	int pId;
	double price;
}
class Electronics extends Product{
	String brandName;
}
class Mobile extends Electronics{
	String modelName;
	String modelNo;
	
	void display() {
		System.out.println("Product Id:"+pId);
		System.out.println("Model Name:"+modelName);
		System.out.println("Brand Name:"+brandName);
		System.out.println("Model No:"+modelNo);
		System.out.println("Price:"+price);
	}
}
public class MultilevelInheritance {
  
	public static void main(String[] args) {
		  
		Mobile m1=new Mobile();
		m1.pId=132;
		m1.price=75000.0;
		m1.modelName="Iphone 15";
		m1.brandName="Apple";
		m1.modelNo="xxxxx143";
		
		m1.display();
		
	}
}
