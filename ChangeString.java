/*
Есть два метода.
Первый changeWord получает в качестве аргументов:
	1. Исходный текст, в котором требуется внести изменения;
	2. Искомое слово, которое требуется заменить;
	3. Слово, которое пользователь предоставил для замены.
Если пользователь в качестве второго аргумента предоставил слово,
которого нет, то он получит тот же самый текст.

Второй метод extractWord получает в качестве аргументов:
	1. Исходный текст, в котором требуется внести изменения;
	2. Индекс слова, которое необходимо получить из текста, как отдельную строку.
*/
import java.util.*;
public class ChangeString {
	public static String changeWord(String text, String oldWord, String newWord) {
		StringBuilder newStr = new StringBuilder();
		String[] arr = text.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(oldWord)) {
				arr[i] = newWord;
				break;
			}
		}
		for (String word : arr) {
			newStr.append(word + " ");
		}
		return newStr.toString();
	}
	public static String extractWord(String text, int n) {
		String[] arr = text.split(" ");
		return arr[n];
	}
	public static void main(String[] args) {
		String newString = changeWord("Я хороший разработчик автотестов", "хороший", "очень хороший");
		System.out.println(newString);
		String newString1 = extractWord(newString, 2);
		System.out.println(newString1);
	}
}