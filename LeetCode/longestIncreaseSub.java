public class longestIncreaseSub {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(longestIncreaseSubAl(arr));
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
}
