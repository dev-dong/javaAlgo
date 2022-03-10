package array;

import java.util.Arrays;

public class Practice02_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {2, 3, 1};
        int checkSum = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    checkSum += 1;
                }
            }
        }

        if (checkSum == arr1.length) {
            System.out.println("A배열" + Arrays.toString(arr1) + "B배열" + Arrays.toString(arr2) + "은 같은 배열입니다.");
        }
    }
}
