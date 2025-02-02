package productcrud;

import java.util.Scanner;

public class ProductMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {

			System.out.println("1.Add Product");
			System.out.println("2.View Product");
			System.out.println("3.Update Product");
			System.out.println("4.Delete Product");
			System.out.println("5.Exit");
			System.out.print("Enter Your Choice :");
			choice = sc.nextInt();

			JavaCrudOperations op = new JavaCrudOperations();

			if (choice == 1) {

				System.out.println("********** Add Product ************");

				System.out.print("Enter Product Name:");
				String pName = sc.next();
				sc.nextLine();

				System.out.print("Enter Price:");
				int price = sc.nextInt();

				System.out.print("Enter Quantity:");
				int qty = sc.nextInt();

				op.addProduct(pName, price, qty);

			}

			else if (choice == 2) {
				System.out.println("********** View Product ************");
				op.viewProduct();

				System.out.println();
				System.out.println("***************************************");

			} else if (choice == 3) {
				System.out.println("********** Issue Product ************");

				System.out.print("Enter Product Name:");
				String pName = sc.next();

				System.out.print("Enter Quantity:");
				int qty = sc.nextInt();

				op.updateProduct(pName, qty);

				System.out.println();

			} else if (choice == 4) {
				System.out.println("********** Delete Product ************");

				System.out.print("Enter Product Name:");
				String pName = sc.next();
				op.deleteProduct(pName);

			} else if (choice == 5) {

				System.out.println();
				System.out.println("Thank You For Visit......");
			} else {
				System.out.println("Invalid Choice");
			}

		} while (choice != 5);
	}
}
