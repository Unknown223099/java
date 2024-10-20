public class MinMaxFinder {
    public static void findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = array[0]; // Initialize min to the first element
        int max = array[0]; // Initialize max to the first element

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];             
            }
            if (array[i] > max) {
                max = array[i]; 
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        findMinMax(numbers);
    }
}
