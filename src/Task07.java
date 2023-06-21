import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
        int i = scanner.nextInt();
        int mask = 1;
        number = number>>i;
        System.out.println(Integer.toBinaryString(number));
        number = mask&number;
        System.out.println(Integer.toBinaryString(number));
    }
}
