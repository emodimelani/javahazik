public class tipuskinverziok {
	public static void main(String[] args) {
		long longErtek = Long.parseLong("123");
		float floatErtek = Float.parseFloat("3.14");
		double doubleErtek = Double.parseDouble("7.89");
		char karakter = "a".charAt(0);
		int x = Integer.parseInt("42");

		System.out.println("\"123\" -> long: " + longErtek);
		System.out.println("\"3.14\" -> float: " + floatErtek);
		System.out.println("\"7.89\" -> double: " + doubleErtek);
		System.out.println("\"a\" -> char: " + karakter);
		System.out.println("Integer.parseInt(\"42\") -> int: " + x);
	}
}
