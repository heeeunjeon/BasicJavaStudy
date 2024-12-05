package loop.ex;
/*
    문제: 짝수 출력
    반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요.
    이때, `num` 이라는 변수를 사용하여 수를 표현해야 합니다.
    while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int cnt = 1;

        // while문 ver.
        while(cnt <= 10) {
            System.out.println(num);
            num += 2;
            cnt++;
        }

        System.out.println();

        // for문 ver.
        int num1 = 2;

        for (int cnt2 = 1; cnt2 <= 10; cnt2++) {
            System.out.println(num1);
            num1 += 2;
        }

        System.out.println();

        for(int num3 = 2, cnt3 = 1; cnt3 <=10; num3 +=2, cnt3++) {
            System.out.println(num3);
        }
    }
}
