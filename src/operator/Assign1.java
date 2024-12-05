package operator;

public class Assign1 {
    public static void main(String[] args) {
        // 복합대입연산자 (축약연산자)
        int a = 5;
        a += 3; // a = a(5) + 3
        System.out.println(a); // 8
        a -= 2;
        System.out.println(a); // 6
        a *= 4;
        System.out.println(a); // 24
        a /= 3; // 나누기
        System.out.println(a); // 8
        a %= 3; // 나머지
        System.out.println(a); // 2



    }
}
