public class Task7 {
    public static void main(String[] args) {
        int answer = addUpTo(7);
        System.out.println(answer);
    }

    public static int addUpTo(int max_value) {
        int answer = 0;
        for (int i = 0; i <= max_value; i++) {
            answer += i;
        }
        return answer;
    }
}
