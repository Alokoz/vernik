/*
Задача:
Необходимо найти самый большой простой делитель числа 600 851 475 143.
*/
import java.util.*;

public class Work {
	// Функция проверяет является ли переданное ей число простым.
	public static boolean isPrime(int n) {
	    if (n < 2) return false;
	    for(int p = 2; p < Math.sqrt(n); p++) {
	        if(n % p == 0) return false;
	    }
	    return true;
	}
	// Функция возвращает наибольшее простое число, являющееся делителем числа, переданного функции в качестве параметра.
	public static long maxPrimeDevisor(long num) {
		long biggestPrimeNum = 0L;
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if ((num % i == 0) && isPrime(i)) {
				biggestPrimeNum = i;
			}
		}
		return biggestPrimeNum;
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long answ = maxPrimeDevisor(600851475143L);
		long stop = System.currentTimeMillis();
		System.out.println("Время, необходимое на решение задачи: " + (stop - start) / 1000.0f);
		System.out.println("Cамый большой простой делитель числа 600 851 475 143: " + answ);
	}
}

