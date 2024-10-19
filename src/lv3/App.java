package lv3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();
        ArrayList<Double> resultList = new ArrayList<>(); // 연산 결과를 담을 리스트 생성

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            double firstNumber = sc.nextDouble();

            System.out.print("두 번째 정수를 입력하세요: ");
            double secondNumber = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            OperatorType operatorType = OperatorType.getType(operator);

            double calculateResult = calculator.calculate(firstNumber, secondNumber, operatorType); // 사칙연산 계산

            resultList.add(calculateResult); // 리스트에 연산 결과를 담음
            System.out.println("결과 리스트: " + resultList);

            double max = resultList.stream().max(Double::compare).get();
            System.out.println("최댓값: " + max);

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