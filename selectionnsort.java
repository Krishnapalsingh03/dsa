import java.util.Arrays;

public class selectionnsort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        selectionsort(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

          
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}