public class longestIncreaseSub {
    public static void main(String[] args){
        int[] arr = {0, 1, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(longestIncreaseSubAl(arr));
        System.out.println(longestContinuousIncreasing(arr));
    }

    public static int longestIncreaseSubAl(int[] arr){
        if (arr == null) return 0;
        int[] cache = new int[arr.length];
        cache[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]){
                    cache[i] = Math.max(cache[i], cache[j] + 1);
                }
            }
        }
        int length = 1;
        for (int res:cache) {
            length = Math.max(res, length);
        }
        return length;
    }

    public static int longestContinuousIncreasing(int[] arr){
        if(arr == null) return 0;

        int result = 0;
        int anchor =0;

        for(int i =0; i < arr.length;i++){
            if (i > 0 && arr[i - 1] >= arr[i]) anchor = i;
            result = Math.max(result, i - anchor + 1);
        }

        return result;
    }
}
