import java.util.Scanner;

public class Main {
    public static int solution(int a, int b) {
        int result = 0;
        int x = a * b;
        String binary = Integer.toBinaryString(x);
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = solution(a, b);
        System.out.println(result);
    }
}
