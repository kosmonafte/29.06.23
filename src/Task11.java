import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int i = 31;
        int mask = 1;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        for (;i >= 0; i--) {
            if ((input>>i&mask) == 1) {
                count++;
            }
        }
        System.out.println(Integer.toBinaryString(input));
        System.out.println(count);
    }
}
