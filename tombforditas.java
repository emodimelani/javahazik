import java.util.Arrays;

public class tombforditas {
    private tombforditas() {
    }

    public static void reverse(int[] tomb) {
        for (int i = 0; i < tomb.length / 2; i++) {
            int masik = tomb.length - 1 - i;
            int ideiglenes = tomb[i];
            tomb[i] = tomb[masik];
            tomb[masik] = ideiglenes;
        }
    }

    public static void main(String[] args) {
        int[] tomb = {1, 2, 3, 4, 5};
        tombforditas.reverse(tomb);
        System.out.println(Arrays.toString(tomb));
    }
}