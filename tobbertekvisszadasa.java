import java.util.Arrays;

public class tobbertekvisszadasa {
	public static int[] elsoEsUtolso(int[] tomb) {  //V1
		return new int[] { tomb[0], tomb[tomb.length - 1] };
	}

	public static void main(String[] args) {
		int[] tomb = { 3, 7, 2, 9 };
		System.out.println(Arrays.toString(elsoEsUtolso(tomb)));
	}
}
