package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위증감연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a값을 먼저 증가시키고, 결과를 b에 대입
        System.out.println("a = " + a  +", b = " + b);

        // 후위증감연산자
        a = 1;
        b = 0;

        b = a++; // a의 현재값을 b에 먼저 대입, 그 후 a의 값을 증가
        System.out.println("a = " + a + ", b = " + b);

        // 참고로 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에, 본인의 값만 증가한다.
        // 따라서 전위이든 후위이든 둘다 결과가 같다.
        a++;
        b++;

    }
}
