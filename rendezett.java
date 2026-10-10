public class rendezett {
    public static boolean isSorted(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tomb = {3, 5, 1, 2};
        boolean rendezette = isSorted(tomb);
        System.out.println(rendezette);
    }
}
