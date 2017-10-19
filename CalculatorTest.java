/*
Задача:    В сущность под названием "калькулятор" вводятся данные (один из 4 операторов и 2 операнда). Калькулятор должен выдавать решение операции.
*/
import java.util.*;
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// Тесты:
		if (calc.calculate("2+3") == 5) {
			System.out.println("First test passed.");
		}
		if (calc.calculate("5-3") == 2) {
			System.out.println("Second test passed.");
		}
		if (calc.calculate("6/2") == 3) {
			System.out.println("Third test passed.");
		}
		if (calc.calculate("3*2") == 6) {
			System.out.println("Fourth test passed.");
		}
		if (calc.calculate("3/0") == 0) {
			System.out.println("Fifth test passed. You cannot divide by 0.");
		}
	}
}

class Calculator {
	public long calculate(String expression) {
		long result = 0;
		long operand1 = Long.valueOf(expression.substring(0,1));
		long operand2 = Long.valueOf(expression.substring(2,3));
		switch (expression.substring(1,2)) {
			case "+":
				result = Plus.count(operand1, operand2);
				break;
			case "-":
				result = Minus.count(operand1, operand2);
				break;
			case "*":
				result = Multiply.count(operand1, operand2);
				break;
			case "/":
				result = Divide.count(operand1, operand2);
				break;
		}
		return result;
	}
}
class Plus {
	public static long count(long operand1, long operand2) {
		return operand1 + operand2;
	}
}
class Minus {
	public static long count(long operand1, long operand2) {
		return operand1 - operand2;
	}
}
class Multiply {
	public static long count(long operand1, long operand2) {
		return operand1 * operand2;
	}
}
class Divide {
	public static long count(long operand1, long operand2) {
		try {
			return operand1 / operand2;
		} catch (ArithmeticException ex) {
			return 0;
		}
	} 
}