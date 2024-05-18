public class Task_3 {
    public static void main(String[] args) {
        printColor();
    }
    static void printColor() {
        int value = 88;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
}
