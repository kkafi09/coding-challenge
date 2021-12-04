import java.util.*;

public class majorityElement{
    public static void main(String[] args){
        int[] arr = {3, 5, 3, 3, 2, 4, 3};
        System.out.println(majority(arr));
    }

    public static int majority(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
                int count = map.get(arr[i]);
                if(count > arr.length / 2){
                    return arr[i];
                }
                
            } else{
                map.put(arr[i],1);
            }
        }     
     
        return 0;
    }
}