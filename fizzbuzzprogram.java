public class fizzbuzzprogram {
    private final int felsoHatar;

    public fizzbuzzprogram(int felsoHatar) {
        this.felsoHatar = felsoHatar;
    }

    public void start() {
        for (int i = 1; i <= felsoHatar; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        fizzbuzzprogram fizzbuzz = new fizzbuzzprogram(100);
        fizzbuzz.start();
    }
}
