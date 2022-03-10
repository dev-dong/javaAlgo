package array;

import java.util.Scanner;

public class Practice02_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        String c = scanner.next();

        if (c.length() > 1) {
            System.out.println("문자 1개만 입력하세요.");
            return;
        }

        System.out.println("입력받은 문자: " + c);
        System.out.println("대문자 변환 문자: " + c.toUpperCase());

    }
}
