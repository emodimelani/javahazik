import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tobbertekvisszadas2 {
	private static int[] minMaxTomb(List<Integer> szamok) {
		int minimum = szamok.get(0);
		int maximum = szamok.get(0);
		for (int szam : szamok) {
			if (szam < minimum) {
				minimum = szam;
			}
			if (szam > maximum) {
				maximum = szam;
			}
		}
		return new int[] { minimum, maximum };
	}

	private static List<Integer> minMaxLista(List<Integer> szamok) {
		int minimum = szamok.get(0);
		int maximum = szamok.get(0);
		for (int szam : szamok) {
			if (szam < minimum) {
				minimum = szam;
			}
			if (szam > maximum) {
				maximum = szam;
			}
		}
		List<Integer> eredmeny = new ArrayList<>();
		eredmeny.add(minimum);
		eredmeny.add(maximum);
		return eredmeny;
	}

	private static MinMax minMaxObjektum(List<Integer> szamok) {
		int minimum = szamok.get(0);
		int maximum = szamok.get(0);
		for (int szam : szamok) {
			if (szam < minimum) {
				minimum = szam;
			}
			if (szam > maximum) {
				maximum = szam;
			}
		}
		return new MinMax(minimum, maximum);
	}

	private static class MinMax {
		private final int minimum;
		private final int maximum;

		private MinMax(int minimum, int maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

		@Override
		public String toString() {
			return "MinMax{minimum=" + minimum + ", maximum=" + maximum + "}";
		}
	}

	public static void main(String[] args) {
		List<Integer> szamok = new ArrayList<>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
		szamok.add(1);
		System.out.println("Tomb: " + Arrays.toString(minMaxTomb(szamok)));
		System.out.println("Lista: " + minMaxLista(szamok));
		System.out.println("Sajat objektum: " + minMaxObjektum(szamok));
	}
}
