package lv1;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            double firstNumber = sc.nextDouble();

            System.out.print("두 번째 정수를 입력하세요: ");
            double secondNumber = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();

            double add = firstNumber + secondNumber;
            double subtract = firstNumber - secondNumber;
            double multiply = firstNumber * secondNumber;
            double divide = firstNumber / secondNumber;

            switch (operator) {
                case "+":
                    System.out.println("결과: " + add);
                    break;
                case "-":
                    System.out.println("결과: " + subtract);
                    break;
                case "*":
                    System.out.println("결과: " + multiply);
                    break;
                case "/":
                    if (secondNumber != 0) {
                        System.out.println("결과: " + divide);
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 사칙연산 기호를 입력했습니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.next();

            if (Objects.equals(text, "exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }
    }
}
