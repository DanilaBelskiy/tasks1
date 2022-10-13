public class Task6 {
    public static void main(String[] args) {
        int answer = characterToASCII('\\');
        System.out.println(answer);
    }

    // Returns the ASCII code of a character
    public static int characterToASCII(char character) {
        return (int) character;
    }
}
