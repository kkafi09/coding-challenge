import java.util.Arrays;

public class reversePalindrom{
      public static void main(String[] args){
            String str = "hello";
            String reverse = "";
            int length = str.length();
            
            // reverse 1
            // for(int i = 0; i < length; i++){
            //       reverse = str.charAt(i) + reverse;
            // }
            // System.out.println(reverse);
      
            // reverse 2
            for(int i = length - 1; i >= 0; i--){
                  reverse += str.charAt(i);
            }
            System.out.println(reverse);


            // is palindrom or not 
            // a string palindrom when it stays same on reverseing
            if (str.equals(reverse)){
                  System.out.println("palindrom");
            } else{
                  System.out.println("bukan palindrom");
            }


            // count 1 character in sentence
            int count = 0;
            int occu = 'o';

            for(int j = 0; j < length; j++){
                  if(str.charAt(j) == occu){
                        count++;
                  }
            }
            System.out.println(count);

            // anagrams
            // two Strings are anagrams if they contain same group of characters
            // in varied sequence
            boolean anagrams= false;
            if (str.length() != reverse.length()){
                  System.out.println(str + "and"   + reverse + "not anagrams");
            } else {
                  char[] strChars = str.toCharArray();
                  char[] reverseChars = reverse.toCharArray();
                  Arrays.sort(strChars);
                  Arrays.sort(reverseChars);
                  anagrams =  Arrays.equals(strChars, reverseChars);

                  if(anagrams == true){
                        System.out.println("this sentence anagrams");
                  } else{
                        System.out.println("this sentece not anagrams");
                  }
            }


            // to count how many vowels and consonant
            int consonant = 0;
            int vowels = 0;

            for (int k = 0; k < length; k++){
                  char c = str.charAt(k);
                  if(c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o'){
                        vowels++;
                  } else{
                        consonant++;
                  }
            }
            System.out.println("vowels in this sentence is " + vowels);
            System.out.println("consonant int this sentence is " + consonant);

            // print matching element
            int[] a = {1,2,3,4,5,6,7,8,9,0,1,2};
            for(int m = 0; m < a.length; m++){
                  for(int n = m + 1; n < a.length; n++){
                        if (a[m] == a[n]){
                              System.out.println(a[m]);
                        }
                  }
            }
      }
}

