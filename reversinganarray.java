public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {55, 56, 57, 58, 59};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}