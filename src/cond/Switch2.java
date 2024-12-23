package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        // 새로운 switch문 (자바 14 이상부터 가능함)
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println(coupon);

    }
}
