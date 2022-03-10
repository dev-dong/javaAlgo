package array;

import java.util.Scanner;

public class Practice02_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        char c = scanner.next().charAt(0);

        System.out.println("입력받은 문자: " + c);
        System.out.println("대문자 변환 문자: " + Character.toUpperCase(c));

    }
}
