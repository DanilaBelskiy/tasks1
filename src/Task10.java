public class Task10 {
    public static void main(String[] args) {
        boolean answer = abcmath(42, 5, 10);
        System.out.println(answer);
    }

    // Adds a to itself b times
    // Returns true if it is divisible by c
    // Else returns false
    public static boolean abcmath(int a, int b, int c) {
        return ((a * Math.pow(2, b)) % c) == 0;
    }
}
