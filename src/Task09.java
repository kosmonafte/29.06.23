import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt()  ;
        int numTwo = scanner.nextInt();
        //System.out.println(Integer.toBinaryString(numOne));
        //System.out.println(Integer.toBinaryString(numTwo));
        numTwo >>= 31;
        numOne >>= 31;
        int mask = 1;
        System.out.println(Integer.toBinaryString(mask&numOne^numTwo));
    }
}
