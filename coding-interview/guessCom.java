import java.util.Scanner;

public class guessCom{
      public static void main(String[] args){
            guesscom(1000);
      }

      private static int getRandomNumber(int min, int max){
            return (int)(Math.random() * (max - min) + min);
      }

      private static void guesscom(int x){
            Scanner scanner = new Scanner(System.in);
            int low = 1; 
            int high = x;
            int guess;

            while(true){
                  if(low != high){
                        guess = (int)getRandomNumber(low, high);
                  } else{
                        guess = low;
                  }

                  System.out.printf("is %d too high(h), too low(l), correct(c)", guess);
                  String data = scanner.nextLine();
                  
                  if(data.equals("h")){
                        high = guess - 1;
                  } else if(data.equals("l")){
                        low = guess + 1;
                  } else if (data.equals("c")){
                        System.out.println("you won!");
                        break;
                  }
            }
      }
}