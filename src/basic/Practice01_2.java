package basic;

public class Practice01_2 {
    public static void main(String[] args) {
        int max = maxValue(20, 31, 15, 31, 7);
        System.out.println("최댓값: " + max);
    }

    private static int maxValue(int data1, int data2, int data3, int data4, int data5) {
        int[] max = {data1, data2, data3, data4, data5};

        for (int i = 0; i < max.length; i++) {
            if(max[0] < max[i]) {
                max[0] = max[i];
            }
        }
        return max[0];
    }
}
