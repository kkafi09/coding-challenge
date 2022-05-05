public class selectionSort {
    public static void main(String[] args) {
        int[] array ={12,23,65,4,2,4,6,43,76,2,3,6};
        int size = array.length;
        display(array, size);
        selSort(array, size);
        display(array, size);
    }

    private static void display(int a[], int n) {
        int i = 0;
        while (i < n){
            System.out.print(a[i] + ", ");
            i++;
        }
        System.out.println();
    }

    static void swap (int[] a, int x, int y){
        int temp = a [x];
        a[x] = a[y];
        a[y] = temp;
    }

    static int locOfSmall(int[] a, int s, int e){
        int i = s;
        int j = i;
        while (i <= e){
            if(a[i]<a[j]){
                j = i;
            }
            i = i + 1;
        }
        return j;
    }

    private static void selSort(int[] a, int n){
        int i = 0;
        while (i < n-1){
            int j = locOfSmall(a, i, n-1);
            swap(a, i, j);
            i++;
        }
    }
}