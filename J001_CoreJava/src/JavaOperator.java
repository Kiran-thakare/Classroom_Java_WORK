
public class JavaOperator {

		public static void main(String[] args) {
			// Arithmetic Operator (+,-,*,/,%)
			int result=39%3;
			System.out.println("Result:"+result);
			// Assignment Operator (=,+=,-=,*=,/=,%=) Short Hand Operator 
			int num=34;
			num+=5;
			System.out.println("Number: "+num);
			num%=2;
			System.out.println("Number: "+num);
			//Relational Operator(==,<,>,<=,>=,!=) Mostly Used in 
			//conditions and generate boolean output 
			
		  System.out.println(num==1);
		  System.out.println(num<0);
		  System.out.println(num!=10);
		  
		// Increment/ Decrement Operator  (++,--)
			// num++;			// postfix
			// ++num;			// Prefix
			
			//System.out.println("postfix : "+(num++));
			System.out.println("prefix : "+(++num));
			System.out.println("value of num : "+num);
			
			
			// Logical Operator (&&, ||, !) 
			
			//System.out.println(num>0 && num%2==0);
			// System.out.println(num>0 || num!=2);			// 2!=2
			System.out.println(!(num>0));
			
			
			// Bitwise Operator (&, |, ^, ~, <<, >>)
			int num1 = 5;		// 0101			
			int num2 = 4;		// 0100
								// 0001	
								// 0000	
			
			System.out.println("& : "+(num1 & num2));
			System.out.println("| : "+(num1 | num2));
			System.out.println("^ : "+(num1 ^ num2));
			// System.out.println("~ : "+(~num1));
			System.out.println("<< : "+ (num1<<1));
			System.out.println(">> : "+ (num1>>1));
			
			int number = 3;
			
			if((number & 1) == 0) {
				System.out.println("even number");
			}else {
				System.out.println("odd number");
			}
			
			
		}
}
