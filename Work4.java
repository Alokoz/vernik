/*
Задача:
Найти разность между квадратом суммы и суммой квадратов первых ста натуральных чисел.
*/

public class Work4 {
	public static long countDiff(int num) {
		// Переменная для хранения квадрата суммы.
		long sqrSum = 0;
		for (int i = 1; i <=num; i++) {
			sqrSum += i;
		}
		// Переменная для хранения суммы квадратов.
		long sumSqr = 0;
		for (int i = 1; i <= num; i++) {
			sumSqr += i * i;
		}
		return (sqrSum * sqrSum - sumSqr);
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long answ = countDiff(100);
		long stop = System.currentTimeMillis();
		System.out.println("Время, необходимое на решение задачи: " + (stop - start) / 1000.0f);
		System.out.println("Разница между квадратом суммы и суммой квадратой первых ста натуральных чисел равна: " + answ);
	}
}