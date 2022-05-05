import java.util.Scanner;

public class guess{

      public static void main(String[] args){
            guess(10);
      }

      private static int getRandomNumber(int min, int max){
            return (int)(Math.random() * (max - min) + min);
      }
      
      private static void guess(int x){
            int random_number = getRandomNumber(1, x);
            int guess = 0;

            while (guess != random_number){
                  System.out.print("Guess the number  : ");
                  Scanner data = new Scanner(System.in);
                  Integer data1 = data.nextInt();

                  if (data1 < random_number){
                        System.out.println("sorry guess again, to low");
                  } else if(data1 > random_number){
                        System.out.println("sorry guess again, to high");
                  } else {
                        System.out.println("you won");
                        break;
                  }
            }
      }

}