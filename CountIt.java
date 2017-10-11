public class CountIt {
	public static double count(long x, long y) {
		double result = 3.0 * (x + 2.0 * x - y) / 2.0 * x;
		System.out.println(result);
		return result;
	}
	public static double count(double x, double y) {
		double result = 3.0 * (x + 2.0 * x - y) / 2.0 * x;
		System.out.println(result);
		return result;

	}
	public static double count(long x, double y) {
		double result = 3.0 * (x + 2.0 * x - y) / 2.0 * x;
		System.out.println(result);
		return result;

	}
	public static double count(double x, long y) {
		double result = 3.0 * (x + 2.0 * x - y) / 2.0 * x;
		System.out.println(result);
		return result;

	}

	public static void main(String[] args) {
		count((byte)5, (byte)3); // Работает с типом byte. Получается 90.0.
		count((short)3, (short)1); // Работает с типом short. Получается 36.0.
		count(5, 1); // Работает с int. Получается 105.0.
		count(5.0f, 3.0f); // Работает с float. Получается 90.0.
		count(3.0, 1.0); // Работает с double. Получается 36.
		count(5L, 1L); // Работает с long. Получается 105.0.
		count(5, 3.0f); // Работает со смешанными типами. 90.0
		count(3.0f, 1); // И в обратную сторону. 36.0
	}
}