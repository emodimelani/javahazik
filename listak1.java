import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listak1 {
	private static int matchEnds(List<String> words) {
		int count = 0;
		for (String word : words) {
			if (word.length() >= 2 && word.charAt(0) == word.charAt(word.length() - 1)) {
				count++;
			}
		}
		return count;
	}

	private static List<String> frontX(List<String> words) {
		List<String> xWords = new ArrayList<>();
		List<String> otherWords = new ArrayList<>();

		for (String word : words) {
			if (word.startsWith("x")) {
				xWords.add(word);
			} else {
				otherWords.add(word);
			}
		}

		Collections.sort(xWords);
		Collections.sort(otherWords);

		xWords.addAll(otherWords);
		return xWords;
	}

	private static void test(int got, int expected) {
		String prefix = (got == expected) ? " OK " : "  X ";
		System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
	}

	private static void test(List<String> got, List<String> expected) {
		var prefix = (got.equals(expected)) ? " OK " : "  X ";
		System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
	}

	public static void main(String[] args) {
		System.out.println("match_ends");
		test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
		test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
		test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

		System.out.println();
		System.out.println("front_x");
		test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
				List.of("xaa", "xzz", "axx", "bbb", "ccc"));
		test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
				List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
		test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
				List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
	}
}
 