public class firstDuplicate{
    public static void main(String[] args){

    }

    public static int firstDuplicate(int[] arr){
        int minimum_second_index = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    int minimum_second_index = Math.min(minimum_second_index, j);
                }
            }
        }

        if (minimum_second_index == arr.length) return -1;
        else return arr[minimum_second_index];
    }

    public static int firstDuplicate2(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if(seen.contains(arr[i])){
                return arr[i];
            } else{
                see.add(a[i])
            }
        }
        return -1;
    }

    public static int firstDuplicate3(int[] arr){
        for(int i = 0; i< arr.length;i++){
            if(a[Math.abs(a[i] - 1) < 0]){
                return Math.abs(a[i]);
            } else{
                a[Math.abs(a[i] - 1] = -a[Math.abs(a[i] - 1];
            }
        }
        return -1;
    }
}