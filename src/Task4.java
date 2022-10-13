public class Task4 {
    public static void main(String[] args) {
        boolean answer = profitableGamble(0.9, 1, 2);
        System.out.println(answer);
    }

    // Returns true if prob * prize > pay, else returns false
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return (prob * prize - pay) > 0;
    }
}
