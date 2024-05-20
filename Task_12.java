public class Task_12 {
    public static void main(String[] args) {
        int[] replaceValues2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nTask 12: ");
        task12(replaceValues2);
    }
    public static void task12(int[] replaceValues2) {
        for (int i = 0; i < replaceValues2.length; i++) {
            if (replaceValues2[i] < 6) {
                replaceValues2[i] = replaceValues2[i] * 2;
            }
            System.out.print(replaceValues2[i] + " ");
        }
}}
