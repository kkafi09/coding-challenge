// you given an array [-7, -3, -1, 4, 8, 12] => [1,9,16,49,64,144]
// the problem is you have to squared each index, and sorted

import java.util.Arrays;

public class sortedSquaredArray{
    public static void main(String[] Array){
        int[] arr = {-7, -3, -1, 4, 8, 12};
        System.out.println(Arrays.toString(sortedSquaredArray2(arr)));
    }

    public static int[] sortedSquaredArray1(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static int[] sortedSquaredArray2(int[] arr){
        int[] result = new int[arr.length];
        int first = 0;
        int last = arr.length-1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(Math.abs(arr[first]) > arr[last]){
                result[i] = arr[first] * arr[first];
                first++;
            } else{
                result[i] = arr[last] * arr[last];
                last--;
            }
        }
        return result;
    }
}