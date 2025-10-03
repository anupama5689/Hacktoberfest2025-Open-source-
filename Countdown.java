public class Countdown {
    public static void main(String[] args) {
        int start = 10; // starting number for countdown

        System.out.println("Countdown begins...");

        for (int i = start; i >= 1; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // wait 1 second between numbers
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted");
            }
        }

        System.out.println("🚀 Blast off!");
    }
}
