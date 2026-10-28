public class fizzbuzz2 {
    public static void main(String[] args) {

        // Létrehozunk egy FizzBuzz objektumot.
        // A 100 azt jelenti, hogy 1-től 100-ig vizsgáljuk a számokat.
        FizzBuzz fb = new FizzBuzz(100);

        // Meghívjuk a start() metódust, amely kiírja az eredményt.
        fb.start();
    }
}

// Saját osztály a feladat megoldásához.
class FizzBuzz {

    // Ebben tároljuk a felső határt.
    int limit;

    // Konstruktor: megkapja a felső határt, és eltárolja.
    public FizzBuzz(int limit) {
        this.limit = limit;
    }

    // Ez a metódus végzi a számok vizsgálatát.
    public void start() {

        // A ciklus 1-től a megadott felső határig fut.
        for (int i = 1; i <= limit; i++) {

            // Először azt vizsgáljuk, hogy 3-mal ÉS 5-tel osztható-e.
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");

            // Ha csak 3-mal osztható:
            } else if (i % 3 == 0) {
                System.out.println("fizz");

            // Ha csak 5-tel osztható:
            } else if (i % 5 == 0) {
                System.out.println("buzz");

            // Ha egyik feltétel sem teljesül:
            } else {
                System.out.println(i);
            }
        }
    }
}