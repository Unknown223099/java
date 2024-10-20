import java.util.Arrays;

public class SortData {
    private int[] data;

    public SortData(int[] data) {
        this.data = data;
    }

    public void asec() {
        Arrays.sort(data); 
    }

    public void desc() {
        Arrays.sort(data); 
        reverseArray(); 
    }

    private void reverseArray() {
        int left = 0;
        int right = data.length - 1;

        while (left < right) {
            
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            
            left++;
            right--;
        }
    }

    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        SortData sorter = new SortData(arr);

        System.out.println("Original Data:");
        sorter.printData();

        System.out.println("Sorted in Ascending Order:");
        sorter.asec();
        sorter.printData();

        System.out.println("Sorted in Descending Order:");
        sorter.desc();
        sorter.printData();
    }
}
