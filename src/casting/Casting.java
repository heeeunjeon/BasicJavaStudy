package casting;

public class Casting {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int => long
        System.out.println("longValue = " + longValue); // 10 출력
        
        doubleValue = intValue; // int => double
        System.out.println("doubleValue = " + doubleValue); // 10.0 출력
        
        doubleValue = 20L; // long => double
        System.out.println("doubleValue = " + doubleValue); // 20.0 출력

    }
}
