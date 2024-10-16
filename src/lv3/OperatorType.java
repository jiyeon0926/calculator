package lv3;

import javax.swing.plaf.PanelUI;

// 연산자 타입 관리
public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTI('*'),
    DIVIDE('/');

    private final char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    // 열거 상수 값과 파라미터 값(type 변수)이 일치하면 반환
    public static OperatorType getType(char type) throws IllegalArgumentException {
        for (OperatorType value : OperatorType.values()) {
            if (value.operator == type) {
                return value;
            }
        }

        throw new IllegalArgumentException(type + " 연산자는 잘못된 연산자 입니다.");
    }
}