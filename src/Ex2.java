public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6, 4, 12, 5, 4, 100, 55};
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Tổng của dãy là: " + sum);
        System.out.println("Số lớn nhất trong mảng là: " + max);

    }

}
