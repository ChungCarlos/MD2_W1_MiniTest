import java.util.Scanner;

public class Ex1 {

    // Hàm kiểm tra SNT:
    public static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //In ra những số nguyên tố nhỏ hơn số n vừa nhập vào từ bàn phím:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 số:");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if (check(i)) {
                System.out.println(" Số NT nhở hơn " + num + " là: " + i);
            }
        }
    }
}
