import java.util.HashMap;

public class nonRepeating {
    public static void main(String[] args) {
        System.out.println(moreNonRepeating("aaabcccd"));
        System.out.println((int)'a');
        System.out.println((int)'A');
    }

    public static char nonRepeating(String s){
        for (int i = 0; i < s.length(); i++) {
            boolean current = false;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && (i != j)){
                    current = true;
                    break;
                }
            }
                if(!current) return s.charAt(i);
        }
        return '_';
    }

    public static char nonRepeating02n(String s){
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count.containsKey(c)){
                count.put(c, count.get(c) +1);
            } else{
                count.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(count.get(c) == 1) return c;
        }
        return '_';
    }
    
    public static char moreNonRepeating(String s){
        char[] letter = new char[26];

        for(char c : s.toCharArray()) letter[c - 'a']++;

        for(char c : s.toCharArray()){
            if(letter[c - 'a'] == 1) return c;
        }
        return '_';
    }
    
}
