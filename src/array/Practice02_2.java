package array;

public class Practice02_2 {
    public static void main(String[] args) {
        int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

        System.out.println("최솟값: " + minValue(arr));
        System.out.println("최댓값: " + maxValue(arr));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];

        for (int data : arr) {
            if (data < min) {
                min = data;
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];

        for (int data : arr) {
            if (data > max) {
                max = data;
            }
        }
        return max;
    }
}
