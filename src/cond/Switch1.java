package cond;
/*
    당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
    이 프로그램은 `int grade` 라는 변수를 사용하며, 회원 등급(`grade` )에 따라 다음의 쿠폰을 발급해야 한다.
    1등급: 쿠폰 1000
    2등급: 쿠폰 2000
    3등급: 쿠폰 3000
    위의 등급이 아닐 경우: 쿠폰 500
    각 쿠폰이 할당된 후에는 `"발급받은 쿠폰 " + 쿠폰값` 을 출력해야 한다.
 */
public class Switch1 {
    public static void main(String[] args) {
        int grade = 5;
        int coupon;

        // if문으로 쓴다면
        if(grade == 1) { // 1등급 쿠폰 1000
            coupon = 1000;
            System.out.println("발급받은 쿠폰 = " + coupon);
        } else if (grade == 2) {
            coupon = 2000;
            System.out.println("발급받은 쿠폰 = " + coupon);
        } else if(grade == 3) {
            coupon = 3000;
            System.out.println("발급받은 쿠폰 = " + coupon);
        } else {
            coupon = 500;
            System.out.println("발급받은 쿠폰 = " + coupon);
        }

        // switch문으로 쓴다면
        switch (grade) {
            case 1 :
                coupon =1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);

    }
}