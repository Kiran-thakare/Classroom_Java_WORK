package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionUserColor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> color = new ArrayList<String>();

		while (true) {
			
			

			System.out.println("1.Add Color");
			System.out.println("2.Remove Color");
			System.out.println("3.Update Color");
			System.out.println("4.Show List");
			System.out.println("5.Exit");
			System.out.print("Enter Your Choice:");
			int choice = sc.nextInt();
			
			if(choice<=0) {
				System.out.println("Program End Successfully......");
				break;
			}
			

			switch (choice) {
			case 1:
				System.out.print("Enter Color:");
				String col = sc.next();
				color.add(col);
				System.out.println("Color Add Sucessfully....");
				break;
			case 2:
				System.out.print("Enter Remove Color:");
				String remove = sc.next();
				color.remove(remove);
				System.out.println("Remove Color Successfully....");
				break;
			case 3:
				System.out.print("Enter Color Index:");
				int index = sc.nextInt();
				System.out.print("Enter Color:");
				String newCol = sc.next();
				color.add(index, newCol);
				break;
			case 4:
				System.out.println(color);
				break;

			}
		}
	}
}
