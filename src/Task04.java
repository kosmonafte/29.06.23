import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
        int i = scanner.nextInt();
        int mask = 1;
        mask <<= i;
        System.out.println(Integer.toBinaryString(mask^number));
    }
}
