/*
Задача:
найти наибольшее число-палиндром (такое что справа налево и слева направо читается одинаково), полученное в результате умножения двух трезначных чисел.
*/
import java.util.*;

public class Work2 {
	// Вспомогательная функция, чтобы определить является ли данное число палиндромом.
	public static boolean isPalindrom(String word) {
		return word.equals(new StringBuilder(word).reverse().toString());
	}
	// Функция, которая имеет в качестве параметра число знаков, которое должны содержать числа, подлежащие умножению. Т.е. если согласно поставленной задаче умножаться должны два трехзначных числа, чтобы получить ответ нужно передать функции аргумент равный целому числу 3.
	public static int biggestPalindrom(int numOfFigures) {
		// Создаем ArrayList для хранения всех найденных палиндромов.
		List<Integer> listOfPalindroms = new ArrayList<Integer>();
		// Создаем переменную для хранения размера массива.
		int sizeOfArray = 0;
		// Создаем переменную для хранения стартового числа при заполнении массива.
		int startNum = 0;
		// Определяем значение вспомогательных переменных для дальнейшего расчета.
		if (numOfFigures == 2) { // Если в условии указано умножение двухзначных чисел.
			sizeOfArray = 90;
			startNum = 10;
		} else if (numOfFigures == 3) { // Если в условии указано умножение трехзначных чисел.
			sizeOfArray = 900;
			startNum = 100;
		} else {
			System.out.println("Sorry, but this method works only with 2 and 3 number of figures.");
		}
		// Создаем двухмерный массив для хранения всех трехзначных чисел от 100 до 999.
		int[][] arr1 = new int[sizeOfArray][sizeOfArray];
		// Заполняем массив.
		for (int i = 0; i < sizeOfArray; i++) {
			for (int y = 0, u = startNum; y < sizeOfArray; y++, u++) {
				arr1[i][y] = u;
			}
		}
		// Перемножаем трехзначные числа и проверяем является ли результат умножения палиндромом.
		// Если результат умножения является числом-палиндромом, записываем его в переменную max_palindrom
		for (int i = 0; i < sizeOfArray; i++) {
			for (int y = i; y < sizeOfArray; y++) {
				if (isPalindrom(String.valueOf(arr1[i][i] * arr1[i][y]))) {
					listOfPalindroms.add(arr1[i][i] * arr1[i][y]);
				}
			}
		}
		// Получаем наибольший из найденных палиндромов.
		return Collections.max(listOfPalindroms);
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long answ = biggestPalindrom(3);
		long stop = System.currentTimeMillis();
		System.out.println("Время, необходимое на решение задачи: " + (stop - start) / 1000.0f);
		System.out.println("Наибольшее число-палиндром: " + answ);
	}
}
