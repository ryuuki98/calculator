package calculator;

import java.util.Scanner;

public class Input {
	private int a;
	private int b;
	Scanner sc = new Scanner(System.in);
	
	private int inputNumber(int count) {
		int number;
		while(true) {
			System.out.printf("%d번째 숫자 : ",count);
			String input = sc.next();
			try {
				number = Integer.parseInt(input);
				break;
			} catch (Exception e) {
				System.err.println("잘못된 숫자");
			}			
		}
		return number;
	}
	
	public Input() {
		a = inputNumber(1);
		b = inputNumber(2);
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
}
