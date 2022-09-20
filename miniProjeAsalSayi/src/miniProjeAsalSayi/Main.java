package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 29;
		int remainder = 1;

		if (number == 1) {
			System.out.println(number + " asal sayı değildir.");
			return;
		}
		if (number < 1) {
			System.out.println("Geçersiz bir sayı girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			remainder = number % i;
			if (remainder == 0) {
				System.out.println(number + " asal sayı değildir.");
				return;
			}

		}
		if (remainder != 0) {
			System.out.println(number + " asal sayıdır");
		}

	}

}
