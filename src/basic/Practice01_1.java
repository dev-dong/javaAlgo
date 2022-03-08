package basic;

public class Practice01_1 {
    public static void main(String[] args) {
        int min = minValue(5, 9, 2, 13);
        System.out.println("최솟값: " + min);
    }

    private static int minValue(int data1, int data2, int data3, int data4) {
        int[] min = {data1, data2, data3, data4};
        int result = 0;
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < min.length; j++) {
                if (min[i] < min[j]) {
                    result = min[i];
                }
            }
        }
        return result;
    }
}
