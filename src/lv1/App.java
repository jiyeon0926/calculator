package lv1;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복문을 통해 계산을 반복하되 exit 문자열을 입력하면 계산 종료
        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int firstNumber = sc.nextInt();

            System.out.print("두 번째 정수를 입력하세요: ");
            int secondNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();

            int add = firstNumber + secondNumber; // +
            int subtract = firstNumber - secondNumber; // -
            int multiply = firstNumber * secondNumber; // *
            int divide = firstNumber / secondNumber; // /

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
                    // 두 번째 정수가 0이 아닐 경우만 나눌 수 있도록 함
                    if (secondNumber != 0) {
                        System.out.println("결과: " + divide);
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;
                default:
                    // case 문에 해당되는 것이 없으면 default 문을 통해 실행할 수 없다고 알려줌
                    System.out.println("잘못된 사칙연산 기호를 입력했습니다.");
            }

            // 계산이 끝나면 더 계산할지 말지 입력 받음
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.next();

            if (Objects.equals(text, "exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }
    }
}
