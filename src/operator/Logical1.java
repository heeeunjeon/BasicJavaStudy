package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&& : AND 연산");
        // 피연산자 : 연산자가 아닌 것들을 피연산자라고 부름
        // 두 피연산자가 모두 참이면 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        System.out.println("|| : OR 연산");
        // 두 피연산자 중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
        System.out.println(true || true); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println("! : 부정연산");
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
    }
}
