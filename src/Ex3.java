import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        // Nhập giá trị cho mảng...
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập giá trị:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
