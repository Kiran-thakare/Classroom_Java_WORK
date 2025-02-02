package Oops;

class Product{
	//Data Member...
	int id ;
	String brandName;
	String desc;
	double mrp;
	int discount;
	float rating;
	String []sizes;
	
	double getSalePrice() {
		double disAmt=mrp*discount/100;
		return mrp-disAmt;
	}
	
	void infoShow() {
		 System.out.println("Id:"+id);
		 System.out.println("BrandName:"+brandName);
		 System.out.println("Description:"+desc);
		 System.out.println("Mrp:"+mrp);
		 System.out.println("Discount:"+discount+" %");
		 System.out.println("Sale Price :"+(int)getSalePrice());
	 }
//	void showSize() {
//		for(String size:sizes) {
//			System.out.print(size+",");
//		}
	void showSize() {
		for(int i=0;i<sizes.length;i++) {
			if(i<sizes.length-1) {
				System.out.print(sizes[i]+",");
			}else {
				System.out.print(sizes[i]);
			}
		}
	}
}
 


public class JavaClassObject {
    
	public static void main(String[] args) {
		 Product p1=new Product();
		 p1.id=11;
		 p1.brandName="KALINI";
		 p1.desc="KURATA WITH TROUSERSAND DUPATTA";
		 p1.mrp=4345;
		 p1.discount=83;
		 p1.sizes=new String[] {"S","L"};
		 p1.rating=4.1f;
		 
		 Product p2=new Product();
		 p2.id=22;
		 p2.brandName="Anayna";
	     p2.desc="KURATA WITH TROUSERSAND DUPATTA";
		 p2.mrp=4890;
		 p2.discount=70;
		 p2.sizes=new String[] {"S","L"};
		 p2.rating=4.3f;
		 
		 p1.infoShow();
		 p1.showSize();
		 System.out.println("\n");
		 System.out.println("********************************");
		 p2.infoShow();
		 p2.showSize();
	}
}
