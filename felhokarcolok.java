import java.util.Scanner;

public class felhokarcolok {
	public static int osszeg(int[] tomb) {
		int osszeg = 0;
		for (int i = 0; i < tomb.length - 1; i++) {
			osszeg += Math.abs(tomb[i] - tomb[i + 1]);
		}
		return osszeg;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Hany elemű legyen a tömb? ");
			int[] tomb = new int[scanner.nextInt()];

			for (int index = 0; index < tomb.length; index++) {
				System.out.print("Add meg a(z) " + (index + 1) + ". erteket: ");
				tomb[index] = scanner.nextInt();
			}

			System.out.println("A szomszédos felhőkarcolók magasságkülönbségeinek az összege: " + osszeg(tomb));
		}
	}
}
