import java.util.Arrays;

public class MyArrayUtils {
    private MyArrayUtils() {
    }

    public static void reverse(int[] tomb) {
        for (int i = 0; i < tomb.length / 2; i++) {
            int masik = tomb.length - 1 - i;
            int ideiglenes = tomb[i];
            tomb[i] = tomb[masik];
            tomb[masik] = ideiglenes;
        }
    }

    public static void sortDescending(int[] tomb) {
        sort(tomb);
        reverse(tomb);
    }

    public static boolean equals(int[] tomb1, int[] tomb2) {
        if (tomb1 == tomb2) {
            return true;
        }
        if (tomb1 == null || tomb2 == null || tomb1.length != tomb2.length) {
            return false;
        }
        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void fill(int[] tomb, int ertek) {
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = ertek;
        }
    }

    public static void sort(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i] > tomb[j]) {
                    int ideiglenes = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = ideiglenes;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] tomb = {2, 5, 1, 4, 3};
        System.out.println(Arrays.toString(tomb));
        MyArrayUtils.sortDescending(tomb);
        System.out.println(Arrays.toString(tomb));
        int[] masikTomb = {5, 4, 3, 2, 1};
        System.out.println(MyArrayUtils.equals(tomb, masikTomb)); 
        MyArrayUtils.sort(tomb);
        System.out.println(Arrays.toString(tomb)); 
        MyArrayUtils.fill(tomb, 7);
        System.out.println(Arrays.toString(tomb)); 
    }
}
