package lv3;

// 연산자 타입 관리
public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }
}