public class Task2 {
    public static void main(String[] args) {
        double answer = triArea(9, 9);
        System.out.println(answer);
    }

    // Returns the area of a triangle given its base and height
    public static double triArea(double base, double height) {
        return (base * height) / 2;
    }
}
