package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기1
        String result1 = "hello" + " world";
        System.out.println("result1 = " + result1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2);
        
        // 문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println("result3 = " + result3);

        /* 계산 과정
            문자: "a + b = "
            숫자: 10

            "a + b = "(String) + 10(int) //문자열과 숫자 더하기
            "a + b = "(String) + "10"(int -> String) //숫자를 문자열로 변경
            "a + b = " + "10" //문자열과 문자열 더하기
            "a + b = 10" //결과
        */

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num; // 변수에 담겨 있어도 문자와 숫자를 더하면 문자가 된다.
        System.out.println(result4);

    }
}
