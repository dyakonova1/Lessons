public class Task_9 {
    public static void main(String[] args) {
        leapYear();
    }

    static boolean leapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }
    static void leapYear() {
        System.out.println(leapYear(2024));
    }
}
