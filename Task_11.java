public class Task_11 {
    public static void main(String[] args) {
        System.out.println("\nTask 11: ");
        task11(100);
    }
    public static void task11(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
}
