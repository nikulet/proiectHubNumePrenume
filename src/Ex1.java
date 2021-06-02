import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 3, 7, 8, 2, 1, 11, 5};

        int temp;
        int size = unsortedArray.length;

        System.out.println(Arrays.toString(unsortedArray));
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (unsortedArray[i] > unsortedArray[j]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        System.out.print("Cea mai mica valoare este: " + unsortedArray[0]);
    }
}