package lv2;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> list = new ArrayList<>();

    public int calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                list.add(result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                list.add(result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                list.add(result);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = firstNumber / secondNumber;
                    list.add(result);
                }
                break;
            default:
                System.out.println("사칙연산자만 허용합니다.");
        }
        return result;
    }

    public void getCalculate() {
        System.out.println("결과: " + list.get(0));
    }

    public void setCalculate() {
        for (int result : list) {
            list.set(0, result);
        }
    }

    public void removeResult() {
        list.remove(0);
        System.out.println("가장 먼저 저장된 데이터가 삭제됐습니다.\n현재 데이터: " + list);
    }
}