
public class JavaArray {

	public static void main(String[] args) {

		int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int arr[] = { 30, 40, 60, 80, 10 };
		String[] language = new String[5];
		language[0] = "Java";
		language[1] = "Python";
		language[2] = "Asp";
		language[3] = "Html";
		language[4] = "JavaScript";

		// Array Length Find Out ....!!!!
		System.out.println("Length Of Array:" + nums.length);
		System.out.println("Length Of Array:" + language.length);

		// Array Element Based index........

		System.out.println("Element Based Index:" + (nums[4]));
		System.out.println("Element Based Index:" + (language[2]));
		
		//Iterate Array element.................
		int sum =0;
		//using For loop:
		for(int i=0;i<nums.length;i++) {
			System.out.println("Element of index"+ i +":"+nums[i]);
			sum+=nums[i];
		}
		System.out.println("The Sumition of Array:"+sum);
		
		// Reverse order
		for(int i=nums.length-1; i>=0; i--) {
			System.out.println("Element of index"+ i +":"+nums[i]);
		}
		
		//Using Advance For loop:
		for(String lan:language) {
			System.out.println(lan);
		}
		sum = 0;
		
		for(int n : nums) {
			//System.out.println(n);
			sum += n;
		}
		
	}
	
}
