/*
Необходимо найти среди чисел от 1 до 1000 невключительно все числа, которые соответствуют требованиям:
1. Число кратно 5;
2. Число кратко 3;
*/

public class CountItSpec {
	public static void main(String[] args) {
		System.out.println("Here are the numbers that satisfy your requirements:");
		for (int i = 1; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}