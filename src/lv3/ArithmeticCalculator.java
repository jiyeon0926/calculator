package lv3;

public class ArithmeticCalculator<T extends Number> {
    // 연산자 파라미터를 enum 클래스의 열거 상수로 받음
    public double calculate(T firstNumber, T secondNumber, OperatorType operator) throws IllegalArgumentException {
        double result = 0;
        double x = firstNumber.doubleValue();
        double y = secondNumber.doubleValue();

        switch (operator) {
            case PLUS:
                result = x + y;
                break;
            case MINUS:
                result = x - y;
                break;
            case MULTI:
                result = x * y;
                break;
            case DIVIDE:
                if (y == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = x / y;
                }
                break;
            default:
                throw new IllegalArgumentException(operator + " 연산자는 잘못된 연산자 입니다.");
        }

        return result;
    }
}