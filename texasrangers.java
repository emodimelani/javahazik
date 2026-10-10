import java.util.ArrayList;
import java.util.List;

public class texasrangers {
}

class JavaUtils {
	public static List<Integer> range(int stop) {
		return range(0, stop, 1);
	}

	public static List<Integer> range(int start, int stop) {
		return range(start, stop, 1);
	}

	public static List<Integer> range(int start, int stop, int step) {
		List<Integer> result = new ArrayList<>();
		for (int value = start; value < stop; value += step) {
			result.add(value);
		}
		return result;
	}
}
