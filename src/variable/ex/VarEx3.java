package variable.ex;

/*
    문제3 - long, boolean 데이터 타입
    클래스 이름: `VarEx3`
    `long` 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하세요.
    `boolean` 타입의 변수를 선언하고, 그 변수를 `true`
    로 초기화한 후 출력하는 프로그램을 작성하세요.
 */
public class VarEx3 {
    public static void main(String[] args) {
        long a = 10000000000L;
        boolean b = true;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
