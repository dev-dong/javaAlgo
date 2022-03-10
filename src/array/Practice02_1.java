package array;

import java.util.Scanner;

public class Practice02_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("양수의 배열 입력: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("입력받은 배열의 모든 합: " + sum);
    }
}
