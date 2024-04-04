package calculator;

import java.util.Scanner;

public class Calculate {
	private Scanner sc = new Scanner(System.in);
	
	private int add(int a, int b) {
		return a + b;
	}
	
	private int subtract(int a, int b) {
		return a - b;
	}

	private int multiply(int a, int b) {
		return a * b;
	}

	private int divide(int a, int b) {
		if (b == 0) {
			System.out.println("0으로 나눌순 없습니다.");
			return 0;
		}
		return a / b;
	}

	public void run() {
		while(true) {
			Input input = new Input();
			
			int a = input.getA();
			int b = input.getB();
			
			String x = "";
			while(true) {
				System.out.print("+ - * / : ");
				x = sc.next();
				if(x.equals("+")||x.equals("-")||x.equals("*")||x.equals("/")) {
					break;
				}
			}
			
			if(x.equals("+")) {
				int c = add(a,b);
				System.out.printf("%d %s %d = %d\n",a,x,b,c);
			}else if(x.equals("-")) {
				int c = subtract(a,b);
				System.out.printf("%d %s %d = %d\n",a,x,b,c);
			}else if(x.equals("*")) {
				int c = multiply(a,b);
				System.out.printf("%d %s %d = %d\n",a,x,b,c);
			}else if(x.equals("/")) {
				int c = divide(a,b);
				System.out.printf("%d %s %d = %d\n",a,x,b,c);
			}
		}
	}
}
