public class Task_10 {
    public static void main(String[] args) {
        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task 10: ");
        task10(replaceValues);
    }
    public static void task10(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
}}

