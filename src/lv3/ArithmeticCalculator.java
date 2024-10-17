package lv3;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    // 연산 결과를 담을 리스트 생성
    ArrayList<Double> list = new ArrayList<>();

    // 연산자 파라미터를 enum 클래스의 열거 상수로 받음
    public double calculate(T firstNumber, T secondNumber, OperatorType operator) throws IllegalArgumentException {
        double result = 0;
        double x = firstNumber.doubleValue();
        double y = secondNumber.doubleValue();

        switch (operator) {
            case PLUS:
                result = x + y;
                list.add(result);
                break;
            case MINUS:
                result = x - y;
                list.add(result);
                break;
            case MULTI:
                result = x * y;
                list.add(result);
                break;
            case DIVIDE:
                if (y == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = x / y;
                    list.add(result);
                }
                break;
            default:
                throw new IllegalArgumentException(operator + " 연산자는 잘못된 연산자 입니다.");
        }

        return result;
    }

    public void getCalculate() {
        System.out.println("결과: " + list.get(0));
    }

    public void setCalculate() {
        for (double result : list) {
            list.set(0, result);
        }
    }
}