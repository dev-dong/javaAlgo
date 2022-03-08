package basic;

public class Practice01_2 {
    public static void main(String[] args) {
        int max = maxValue(20, 31, 15, 31, 7);
        System.out.println("최댓값: " + max);
    }

    private static int maxValue(int data1, int data2, int data3, int data4, int data5) {
        int[] max = {data1, data2, data3, data4, data5};
        int result = 0;

        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if (max[i] > max[j]) {
                    result = max[i];
                }
            }
        }

        return result;
    }
}
