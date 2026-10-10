import java.util.ArrayList;
import java.util.List;

public class listak2 {
	private static List<Integer> removeAdjacent(List<Integer> nums) {
		List<Integer> result = new ArrayList<>();
		for (Integer number : nums) {
			if (result.isEmpty() || !result.get(result.size() - 1).equals(number)) {
				result.add(number);
			}
		}
		return result;
	}

	private static List<String> listMerge(List<String> li1, List<String> li2) {
		List<String> result = new ArrayList<>();
		int index1 = 0;
		int index2 = 0;

		while (index1 < li1.size() && index2 < li2.size()) {
			if (li1.get(index1).compareTo(li2.get(index2)) <= 0) {
				result.add(li1.get(index1));
				index1++;
			} else {
				result.add(li2.get(index2));
				index2++;
			}
		}

		while (index1 < li1.size()) {
			result.add(li1.get(index1));
			index1++;
		}
		while (index2 < li2.size()) {
			result.add(li2.get(index2));
			index2++;
		}
		return result;
	}

	private static <T> void test(List<T> got, List<T> expected) {
		String prefix = (got.equals(expected)) ? " OK " : "  X ";
		System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
	}

	public static void main(String[] args) {
		System.out.println("remove_adjacent");
		test(removeAdjacent(List.of(1, 2, 2, 3)), List.of(1, 2, 3));
		test(removeAdjacent(List.of(2, 2, 3, 3, 3)), List.of(2, 3));
		test(removeAdjacent(List.of()), List.of());

		System.out.println();
		System.out.println("list_merge");
		test(listMerge(List.of("aa", "xx", "zz"), List.of("bb", "cc")),
				List.of("aa", "bb", "cc", "xx", "zz"));
		test(listMerge(List.of("aa", "xx"), List.of("bb", "cc", "zz")),
				List.of("aa", "bb", "cc", "xx", "zz"));
		test(listMerge(List.of("aa", "aa"), List.of("aa", "bb", "bb")),
				List.of("aa", "aa", "aa", "bb", "bb"));
	}
}
