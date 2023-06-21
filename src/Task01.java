import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(Integer.toBinaryString(input));
        int i = 1;
        i = ~i;
        System.out.println(Integer.toBinaryString(i&input));
    }
}
