import java.util.Scanner;

public class swapcase {
	private static String swapCase(String text) {
		StringBuilder result = new StringBuilder();
		for (int index = 0; index < text.length(); index++) {
			char character = text.charAt(index);
			if (Character.isUpperCase(character)) {
				result.append(Character.toLowerCase(character));
			} else if (Character.isLowerCase(character)) {
				result.append(Character.toUpperCase(character));
			} else {
				result.append(character);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Adj meg egy szoveget: ");
			String text = scanner.nextLine();
			System.out.println(swapCase(text));
		}
	}
}
