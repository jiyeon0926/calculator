package lv3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Integer> calculator = new ArithmeticCalculator<>();

        System.out.print("첫 번째 정수를 입력하세요: ");
        int firstNumber = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int secondNumber = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        // enum 클래스의 getType() 메서드를 통해 입력 값이 열거 상수의 값과 일치하는지 판단하고 operatorType 변수에 저장
        OperatorType operatorType = OperatorType.getType(operator);

        // 테스트
        double result = calculator.calculate(firstNumber, secondNumber, operatorType);
        System.out.println("result = " + result);
    }
}
