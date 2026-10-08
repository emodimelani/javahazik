public class math {
    
    public static int abs(int szam) {
        return Math.abs(szam);
    }

    
    public static double exp(double kitevo) {
        return Math.exp(kitevo);
    }

    public static int min(int elso, int masodik) {
        return Math.min(elso, masodik);
    }

    public static int max(int elso, int masodik) {
        return Math.max(elso, masodik);
    }

    public static void main(String[] args) {
        System.out.println("abs(-5) = " + abs(-5));
        System.out.println("exp(1) = " + exp(1));
        System.out.println("min(3, 8) = " + min(3, 8));
        System.out.println("max(3, 8) = " + max(3, 8));
    }
}

