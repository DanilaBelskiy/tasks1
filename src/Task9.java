public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 9};
        int answer = sumOfCubes(arr);
        System.out.println(answer);
    }

    // Returns the sum of cubes of array elements
    public static int sumOfCubes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 3);
        }
        return sum;
    }
}
