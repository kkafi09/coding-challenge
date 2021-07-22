public class kadaneMaxSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSum(arr));
        System.out.println(maximumSum1(arr));
        System.out.println(maximumSum2(arr));
    }

    public static int maximumSum(int[] arr){
        int max_sum = arr[0];
        int current_sum;
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i] + max_sum, arr[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }

    public static int maximumSum1(int[] arr){ //true solution
        int max_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i], arr[i] + arr[i-1]);
            max_sum = Math.max(arr[i], max_sum);
        }
        return max_sum;
    }

    public static int maximumSum2(int[] arr){
        int ans = Integer.MIN_VALUE, a = 0;
        for(int x : arr){
            a += x;
            ans = Math.max(ans, a);
            a = Math.max(a, 0);
        }
        return ans;
    }

}
