public class Task_5 {
    public static void main(String[] args) {
        between10And20();
    }
    static boolean between10And20(int a, int b) {
        return a + b >=10 && a + b <=20;
    }
    static void between10And20() {
        System.out.println(between10And20(11,4));
    }
}
