package lv2;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 반복문을 통해 계산을 반복하되 exit 문자열을 입력하면 계산 종료
        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int firstNumber = sc.nextInt();

            System.out.print("두 번째 정수를 입력하세요: ");
            int secondNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            calculator.calculate(firstNumber, secondNumber, operator); // 사칙연산 계산
            calculator.setCalculate(); // 결과값 수정
            calculator.getCalculate(); // 결과값 반환

            // 계산이 끝나면 더 계산할지 말지 입력 받음
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String text = sc.next();

            if (Objects.equals(text, "exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }

            // 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제
            if (Objects.equals(text, "remove")) {
                calculator.removeResult();
            }
        }
    }
}
