import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int mask = 1;
        for (int i = 30; i >= 0; i--) {
            if (((numOne >> i) & mask) == ((numTwo >> i) & mask)) {
                continue;
            } else {
                if (((numOne >> i) & mask) == 0) {
                    System.out.println(numOne);
                    break;
                } else {
                    System.out.println(numTwo);
                    break;
                }
            }
        }
    }
}
