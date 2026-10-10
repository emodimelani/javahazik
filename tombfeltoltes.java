import java.util.Arrays;
import java.util.Scanner;

public class tombfeltoltes {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Hany elemű legyen a tömb? ");
			int[] tomb = new int[scanner.nextInt()];

			for (int index = 0; index < tomb.length; index++) {
				System.out.print("Add meg a(z) " + (index + 1) + ". erteket: ");
				tomb[index] = scanner.nextInt();
			}

			System.out.println("A tomb elemei: " + Arrays.toString(tomb));
			System.out.println("A tomb legnagyobb eleme: " + minmaxszam.getMaxElem(tomb));
			System.out.println("A tomb legkisebb eleme: " + minmaxszam.getMinElem(tomb));
		}
	}
}
