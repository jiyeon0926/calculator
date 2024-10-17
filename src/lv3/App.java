package lv3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        System.out.print("첫 번째 정수를 입력하세요: ");
        double firstNumber = sc.nextDouble();

        System.out.print("두 번째 정수를 입력하세요: ");
        double secondNumber = sc.nextDouble();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        OperatorType operatorType = OperatorType.getType(operator);
        
        double result = calculator.calculate(firstNumber, secondNumber, operatorType);
        System.out.println("result = " + result);
    }
}
