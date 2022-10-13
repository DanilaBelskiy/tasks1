public class Task5 {
    public static void main(String[] args) {
        String answer = operation(10, 6,4);
        System.out.println(answer);
    }

    // Returns "added" if      a + b = N
    // Returns "subtracted" if a - b = N
    // Returns "multiplied" if a * b = N
    // Returns "divided" if    a / b = N
    // Else returns "none"
    public static String operation(double N, int a, int b) {
        if (a + b == N) {return "added";}
        if (a - b == N) {return "subtracted";}
        if (a * b == N) {return "multiplied";}
        if (a / b == N) {return "divided";}
        return "none";
    }
}
