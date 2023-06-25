import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int i = 31;
        int mask = 1;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (;i >= 0; i--) {
            if ((input>>i&mask) == 1) {
                break;
            }
        }
        for (int j = i; j >= 0; j--) {
            if ((input>>j&mask) == 0) {
                System.out.println("Есть");
                break;
            }
        }
        System.out.println(Integer.toBinaryString(input));
    }
}
