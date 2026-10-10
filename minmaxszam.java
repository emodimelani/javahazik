public class minmaxszam {
	public static int getMinElem(int[] tomb) {

		int minimum = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] < minimum) {
				minimum = tomb[i];
			}
		}
		return minimum;
	}

	public static int getMaxElem(int[] tomb) {

		int maximum = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] > maximum) {
				maximum = tomb[i];
			}
		}
		return maximum;
	}
}
