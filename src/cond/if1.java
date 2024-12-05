package cond;

public class if1 {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) { // true
            System.out.println("성인");
        }
        if(age < 18) { // false이기에 실행 안함
            System.out.println("미성년자");
        }

        if(age >= 21) { // false이므로 else 부분 실행
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }
    }
}
