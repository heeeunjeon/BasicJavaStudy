package loop.ex;
/*
    문제: 구구단 출력
    중첩 for문을 사용해서 구구단을 완성해라.
 */
public class NestedEx1 {
    public static void main(String[] args) {
        /*
            1 * 1 = 1
            ...
            9 * 9 = 81;
        */
        for (int i = 1; i <= 9; i++) { // i가 1일때
            for (int j = 1; j <= 9; j++) { // j도 1로 만들어서
                System.out.println(i + "*" + j + "=" + i*j); // 바로 식 대입해서 출력
            } // j에 대한 식 빠져 나오면 다시 첫번째 i에 대한 식으로 돌아감
        }

    }
}
