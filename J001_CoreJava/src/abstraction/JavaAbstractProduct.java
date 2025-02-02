package abstraction;

abstract class Product {

	String name;
	double price;

	void showProductDetails() {
		System.out.println("Product Name :" + name);
		System.out.println("Product Price :" + price);

	}

	abstract void calculatePrice();

}

class Electronics extends Product {

	 double discount = 5;
	 String brandName;
	 int warrenty;

	

	@Override
	void calculatePrice() {
		double amount = price * discount / 100;
		double disAmt = price - amount;
		System.out.println("Discount Price :" + disAmt);
	}
	
	void showDetails() {
		super.showProductDetails();
		System.out.println("BrandName :" + brandName);
		System.out.println("Warrenty Year :" + warrenty);
	}

}

class Clothes extends Product {

	String[] size = { "S", "M", "L", "XL" };
	String matarial;
	

	@Override
	void calculatePrice() {
     
		if(price>100) {
			double amount=price*5/100;
			 double disAmt=price-amount;
			 System.out.println("Discount Price :"+disAmt);
		}
		else if(price>500) {
			double amount=price*10/100;
			 double disAmt=price-amount;
			 System.out.println("Discount Price :"+disAmt);
		}
	}
	
	void showDetails() {
		super.showProductDetails();
		for(String s:size) {
			System.out.println(s);
		}
		System.out.println("Matarial :"+matarial);
	}

}

public class JavaAbstractProduct {
 
	public static void main(String[] args) {
		 
		Electronics obj1=new Electronics();
		obj1.name="Mi tv 43inch";
		obj1.price=23000.0;
		obj1.brandName="Xiaomi";
		obj1.warrenty=2;
		obj1.showDetails();
		obj1.calculatePrice();
		
		System.out.println("**************");
		
		Clothes obj2=new Clothes();
		obj2.name="Kurta";
		obj2.price=800.0;
		obj2.matarial="silk";
		obj2.showDetails();
		obj2.calculatePrice();
		
	}
}
