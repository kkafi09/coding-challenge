import java.util.Arrays;
import java.util.Random;

public class quickSort{
    public static void main(String[] args){
//        System.out.println("\n====================");
//        System.out.println("Array dengan 10 data");
//        System.out.println("====================");
//        int[] array1 = randomArray(10);
//        System.out.println("Sebelum :" + Arrays.toString(array1));
//        QuickSort(array1);
//        System.out.println("Sesudah :" + Arrays.toString(array1));


//        System.out.println("\n====================");
//        System.out.println("Array dengan 25 data");
//        System.out.println("====================");
//        int[] array2 = randomArray(25);
//        System.out.println("Sebelum :" + Arrays.toString(array2));
//        QuickSort(array2);
//        System.out.println("Sesudah :" + Arrays.toString(array2));


//        System.out.println("\n====================");
//        System.out.println("Array dengan 50 data");
//        System.out.println("====================");
//        int[] array3 = randomArray(50);
//        System.out.println("Sebelum :" + Arrays.toString(array3));
//        QuickSort(array3);
//        System.out.println("Sesudah :" + Arrays.toString(array3));

//        System.out.println("\n====================");
//        System.out.println("Array dengan 100 data");
//        System.out.println("====================");
        int[] array4 = randomArray(10);
        System.out.println("Sebelum :" + Arrays.toString(array4));
        QuickSort(array4);
        System.out.println("Sesudah :" + Arrays.toString(array4));
    }

    private static int[] randomArray(int n){
        Random random = new Random();
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] =random.nextInt(100);
        }

        return result;
    }

    private static void QuickSort(int[] arr, int low, int high){
        if(low > high){
            return;
        }
        int pivot = arr[high];

        int left = partition(arr, low, high, pivot);
        // System.out.print(left);
        QuickSort(arr, low, left-1);
        QuickSort(arr, left + 1, high);
    }

    private static int partition(int[] arr, int low, int high, int pivot){
        int left = low;
        int right = high;

        while (left < right){
            while(arr[left] <= pivot && left < right){
                left++;
            }

            while(arr[right] >= pivot && left < right){
                right--;
            }

            System.out.println("Perubahan = " + Arrays.toString(arr));
            swap(arr, left, right);

        }

        swap(arr, left, high);
        return left;
    }

    private static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static void QuickSort(int[] arr){
        QuickSort(arr, 0, arr.length -1);
    }
}
