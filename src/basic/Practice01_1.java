package basic;

public class Practice01_1 {
    public static void main(String[] args) {
        int min = minValue(5, 9, 2, 13);
        System.out.println("최솟값: " + min);
    }

    private static int minValue(int data1, int data2, int data3, int data4) {
        int[] min = {data1, data2, data3, data4};
        for (int i = 0; i < min.length; i++) {
            if(min[0] > min[i]) {
                min[0] = min[i];
            }
        }
        return min[0];
    }
}
