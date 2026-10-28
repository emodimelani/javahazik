import java.util.Scanner;

public class randomcase {
    public static String randomCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);

            if (Character.isLetter(character)) {
                if (Math.random() < 0.5) {
                    result.append(Character.toLowerCase(character));
                } else {
                    result.append(Character.toUpperCase(character));
                }
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
            System.out.println(randomCase(text));
        }
    }
}
