public class Rusak {
    static int helloCount = 0;
    public static void rusak (int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
            helloCount++;
        }

        rusak((int)n/2);
    }
    public static void main(String[] args) {
        rusak(1000);
        System.out.println("total kata hello yang dicetak: " + helloCount);
    }
}
