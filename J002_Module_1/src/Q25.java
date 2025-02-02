/* Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members.
*/
class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	void showInfo() {
		System.out.println("Name :" + name);
		System.out.println("Age  :" + age);
		System.out.println("PhoneNumber  :" + phoneNumber);
		System.out.println("Address :" + address);
	}

	public void printSalary() {
		System.out.println("Salary :" + salary);
	}

}

public class Q25 {

	public static void main(String[] args) {

		Member m = new Member();
		m.name = "Kiran";
		m.age = 23;
		m.phoneNumber = "8787787878";
		m.address = "Surat,394210";
		m.salary = 23000.0;

		m.showInfo();

		m.printSalary();

	}
}
