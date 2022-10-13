public class Task3 {
    public static void main(String[] args) {
        int answer = animals(5, 2, 8);
        System.out.println(answer);
    }

    public static int animals(int chickens, int cows, int pigs) {
        return (chickens * 2) + (cows * 4) + (pigs * 4);
    }
}
