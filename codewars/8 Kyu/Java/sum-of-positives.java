public class Positive{
  public static int sum(int[] arr){
    int temp = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > 0){
        temp += arr[i];
      }  
    }
    return temp;
  }
}