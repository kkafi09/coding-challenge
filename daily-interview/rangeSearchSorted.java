import java.util.Arrays;
public class rangeSearchSorted{
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 5, 5, 5 ,28, 37, 42};
        int target = 5;
        System.out.println(Arrays.toString(rangeSearch(arr, target)));
    }

    public static int[] rangeSearch(int[] arr, int target){
        int lower = -1;
        int higher = -1;
    
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                if(lower == -1){
                    lower = i;
                }
                higher = i;
            } 
        }
        return new int[]{lower, higher};
    }
}