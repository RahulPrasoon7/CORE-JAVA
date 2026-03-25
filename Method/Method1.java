package com.tka;

public class Method1 {
//	 Check Even Odd (Non parametrised without return type)
//	public void checkEvenOdd() {
//		int a=25;
//		if(a%2==0) {
//			System.out.println(a+" Number is Even");
//		}else {
//			System.out.println(a+"Number is Odd");
//		}
//
//}
//	Check Even Odd (Non parametrised with return type)
//	public String checkEvenOdd() {
//		int a=25;
//		if(a%2==0) {
//			return "Even Number";
//		}else {
//			return  "Odd Number";
//		}
//	
//}
//	Check Even Odd ( parametrised without return type)
//	public void checkEvenOdd(int a) {
//		if(a%2==0) {
//			System.out.println(a+" Number is Even");
//		}else {
//			System.out.println(a+"Number is Odd");
//		}
//	}
//}
//	Check Even Odd ( parametrised with return type)
//	public String checkEvenOdd(int a) {
//		if(a%2==0) {
//			return "Even Number";
//		}else {
//			return "Odd Number";
//		}
//	
//}
//}
//	Check Addition (Non parametrised without return type)
//		public void Addtion( ) {
//			int num1=57;
//			int num2=54;
//		int 	result=num1+num2;
//		System.out.println(result);
//		}
//}
//	Check Addition (Non parametrised with return type)	
//	public int Addtion() {
//		int num1=57;
//		int num2=54;
//	int 	result=num1+num2;
//	return result;
//	}
//}
//	Check Addition ( parametrised without return type)
//	public void Addtion(int num1,int num2 ) {
//	int 	result=num1+num2;
//	System.out.println(result);
//	}
//	Check Addition ( parametrised with return type)
//	public int Addtion( int num1,int num2) {		
//	int 	result=num1+num2;
//	return result;
//	}
//}
//	Check Square (Non parametrised without return type)
//	public void Square() {
//		int a=5;
//		int result=a*a;
//		System.out.println(result);
//	}
//}
//	Check Square (Non parametrised with return type)
//	public int Square() {
//			int a=5;
//			int result=a*a;
//			return result;
//	}
//}

//	Check Square ( parametrised without return type)
//	public void Square(int a) {
//		int result=a*a;
//		System.out.println(result);
//	}
//}
//	Check Square ( parametrised without return type)
//	public int Square(int a) {
//		int result=a*a;
//		return result;
//	}
//}
//	Check LargestNumber (Non parametrised without return type)
//	public void LargestNumber() {
//		int a = 75;
//		int b = 45;
//		if (a > b) {
//			System.out.println(a + "The Number is largest");
//		} else {
//			System.out.println(b + "the number is largest");
//		}
//	}
//}
//	Check LargestNumber (Non parametrised with return type)
//	public int LargestNumber() {
//		int a = 75;
//		int b = 45;
//		if (a > b) {
//			return a;
//		} else {
//			return b;
//		}
//	}
//}
//	Check LargestNumber ( parametrised without return type)
//	public void LargestNumber(int a,int b) {
//		if (a > b) {
//			System.out.println(a + "The Number is largest");
//		} else {
//			System.out.println(b + "the number is largest");
//		}
//	}
//}

//	Check LargestNumber (parametrised with return type)
//	public int LargestNumber(int a,int b) {
//				if (a > b) {
//			return a;
//		} else {
//			return b;
//		}
//	}
//	
//	}
//	Check Palindrome (Non parametrised without return type)
//	public void checkPalindrome() {
//		int num = 123, reverse = 0, original;
//		original = num;
//		while (num != 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//		}
//		if (original == reverse) {
//			System.out.println("It is Palindrome Number" + reverse);
//		} else {
//			System.out.println("It is not a Palindrome Number" + reverse);
//		}
//	}
//}
//	Check Palindrome (Non parametrised with return type)
//	public String checkPalindrome() {
//		int num = 121, reverse = 0, original;
//		original = num;
//		while (num != 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//		}
//		if (original == reverse) {
//			return "The Number is Palindrome";
//		} else {
//			return "The Number is Not Palindrome";
//		}
//	}
//}
//	Check Palindrome ( parametrised without return type)
//	public void checkPalindrome(int num) {
//		int  reverse = 0, original;
//		original = num;
//		while (num != 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//		}
//		if (original == reverse) {
//			System.out.println("It is Palindrome Number" + reverse);
//		} else {
//			System.out.println("It is not a Palindrome Number" + reverse);
//		}
//	}
//}
//	Check Palindrome ( parametrised with return type)
//	public String checkPalindrome(int num) {
//		int reverse = 0, original;
//		original = num;
//		while (num != 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//		}
//		if (original == reverse) {
//			return "The Number is Palindrome";
//		} else {
//			return "The Number is Not Palindrome";
//		}
//	}
//}
//	Check Reverse (Non parametrised without return type)
//	public void checkReverse() {
//		int num=1475,reverse=0;
//		while(num!=0) {
//			int digit=num%10;
//			reverse=reverse*10+digit;
//			num=num/10;
//			
//		}System.out.println(reverse);
//		
//		}
//}
//	Check Reverse ( parametrised without return type)
//	public void checkReverse(int num) {
//		int reverse=0;
//		while(num!=0) {
//			int digit=num%10;
//			reverse=reverse*10+digit;
//			num=num/10;
//			
//		}System.out.println(reverse);
//		
//		}
//}
//	Check Reverse (Non parametrised with return type)
//	public int checkReverse() {
//		int num=1475,reverse=0;
//		while(num!=0) {
//			int digit=num%10;
//			reverse=reverse*10+digit;
//			num=num/10;
//			
//		}
//		return reverse;
//		}
//}
//	Check Reverse ( parametrised with return type)
//	public int checkReverse(int num) {
//		int reverse=0;
//		while(num!=0) {
//			int digit=num%10;
//			reverse=reverse*10+digit;
//			num=num/10;
//			
//		}
//		return reverse;
//		}
//}
//	Check Fibonacci ( parametrised without return type)
//	public void checkFibonacci(int n) {
//		int a=0,b=1;
//		System.out.println(a+" "+b+" ");
//		for(int i=2;i<n;i++) {
//			int c=a+b;
//			System.out.println(c+" ");
//			a=b;
//			b=c;
//		}
//	}
//}
//	Check fibonacci (parametrised with return type)
//	public int checkFibonacci(int n) {
//	int a=0,b=1;
//		System.out.println(a+" "+b+" ");
//		for(int i=2;i<n;i++) {
//			int c=a+b;
//			a=b;
//			b=c;
//		return c;
//			
//		}
//	
//	}
//}
//	check Table(Non parametrised without return type)
	public void checkTable() {
		int i=1,n=8;
		for(i=1;i<=10;i++) {
			System.out.println(i*n);
		}
	}
}
		
		
		
		
		
		
		
		
	
	
