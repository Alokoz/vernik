/*
Задача:
Найти самое маленькое число, которое делится нацело на все числа от 1 до 20.
*/
public class Work3 {
	public static long findNum(long start, long stop) {
		for (long i = stop; ; i++) {
			for (long y = start; y <= stop; y++) {
				// Натыкаясь на первый случай, когда остаток не равен 0, прерываем работу с данным числом и переходим к следующему.
				if ((i % y) != 0) {
					break;
				// Если все числа от 1 до 19 пройдены и искомое число делится на 20 без остатка, то возвращаем искомое число.
				} else if ((y == stop) && ((i % y) == 0)) {
					return i;
				}
			}
		}
	}
	public static void main(String[] args) {
		if (findNum(1,10) == 2520) {
			System.out.println("Тест пройден");
		} else {
			System.out.println("Тест не пройден");
		}
		long start = System.currentTimeMillis();
		long answ = findNum(1,20);
		long stop = System.currentTimeMillis();
		System.out.println("Время, необходимое на решение задачи: " + (stop - start) / 1000.0f);
		System.out.println("Решение задачи: " + answ);
	}
}


