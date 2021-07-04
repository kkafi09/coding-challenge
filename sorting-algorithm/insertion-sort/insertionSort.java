import java.util.Arrays;

public class insertionSort{
    public static void main(String[] args){
        int[] a = {1,24,6,56,3,45,7,89,5,3,12,4,6,8,9};

        insertionSort ob = new insertionSort();
        ob.sort(a);
        printArray(a);

    }

    void myInsertionSort(int arr[]){
    	for(int i = 1; i < arr.length; i++){
            int j = i;
            
            while(j > 0 && a[j - 1] > a[j]){
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
}