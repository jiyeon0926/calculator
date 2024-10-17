package lv3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            double firstNumber = sc.nextDouble();

            System.out.print("두 번째 정수를 입력하세요: ");
            double secondNumber = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            OperatorType operatorType = OperatorType.getType(operator);

            calculator.calculate(firstNumber, secondNumber, operatorType); // 사칙연산 계산
            calculator.setCalculate(); // 결과값 수정
            calculator.getCalculate(); // 결과값 반환

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
