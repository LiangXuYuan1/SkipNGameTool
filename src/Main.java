import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎使用逢n过游戏提示工具");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请问n是多少？请输入一个整数");
        int n = scanner.nextInt();

        if (n <= 0)
            return;

        System.out.println("请问打算从1报数到几？请输入一个整数");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println("" + i + "\t" + (hasN(i, n) ? "过" : i));
        }
    }

    private static boolean hasN(int number, int n) {
        int temp = number;
        while (temp > 0) {
            if (temp % 10 == n) {
                return true;
            }
            temp /= 10;
        }
        return number % n == 0;
    }
}