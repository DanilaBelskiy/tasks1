public class Task4 {
    public static void main(String[] args) {
        boolean answer = profitableGamble(0.9, 1, 2);
        System.out.println(answer);
    }

    public static boolean profitableGamble(double prob, int prize, int pay) {
        return (prob * prize - pay) > 0;
    }
}
