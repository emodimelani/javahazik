public class wrapper {
	private static void bemutat(String metodus, String leiras, Object eredmeny) {
		System.out.println("Metodus: " + metodus);
		System.out.println("Mit csinal: " + leiras);
		System.out.println("Eredmeny: " + eredmeny);
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {
		System.out.println("Character wrapper osztaly");
		bemutat("Character.isLetter('A')", "Ellenorzi, hogy a karakter betu-e.", Character.isLetter('A'));
		bemutat("Character.toUpperCase('a')", "A karaktert nagybetuve alakitja.", Character.toUpperCase('a'));

		System.out.println("Integer wrapper osztaly");
		bemutat("Integer.max(7, 12)", "Visszaadja a ket egesz szam kozul a nagyobbat.", Integer.max(7, 12));
		bemutat("Integer.compare(7, 12)", "Osszehasonlit ket egesz szamot.", Integer.compare(7, 12));

		System.out.println("Double wrapper osztaly");
		bemutat("Double.isFinite(3.14)", "Ellenorzi, hogy a szam veges ertek-e.", Double.isFinite(3.14));
		bemutat("Double.max(3.14, 2.71)", "Visszaadja a ket tizedes szam kozul a nagyobbat.", Double.max(3.14, 2.71));

		System.out.println("Boolean wrapper osztaly");
		bemutat("Boolean.logicalAnd(true, false)", "Logikai es muveletet vegez ket erteken.", Boolean.logicalAnd(true, false));
		bemutat("Boolean.logicalOr(true, false)", "Logikai vagy muveletet vegez ket erteken.", Boolean.logicalOr(true, false));
	}
}
