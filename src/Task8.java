public class Task8 {
    public static void main(String[] args) {
        int answer = nextEdge(9, 2);
        System.out.println(answer);
    }

    // Returns the maximum possible integer length of the third edge of a triangle
    public static int nextEdge(int a, int b) {
        return a + b - 1 ;
    }
}
