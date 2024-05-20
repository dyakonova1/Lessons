public class Task_2 {
    public static void main(String[] args) {
        checkSumSign();
    }
    static boolean checkSumSign(int a, int b) {
        return a + b >= 0;
    }
    static void checkSumSign() {
        System.out.println("Сумма " + (checkSumSign(10, 6) ? "положительная" : "отрицательная"));
    }
}