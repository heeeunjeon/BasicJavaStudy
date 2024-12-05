package loop;
/*
    문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?**
    1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
 */
public class Continue {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) { // 무한반복
            if(i == 3) {
                i++;
               continue;
            }
            System.out.println(i);
            i++;

        }
    }
}
