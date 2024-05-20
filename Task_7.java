public class Task_7 {
    public static void main(String[] args) {
        positiveAndNegative();
    }

    static boolean positiveAndNegative(int a) {
        return a < 0;
    }

    static void positiveAndNegative() {
        System.out.println(positiveAndNegative(-7));
    }
}