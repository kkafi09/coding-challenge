public class reverse{
    public static void main(String[] args){
        System.out.println(reverseNum(24));
        System.out.println(reverseStrings("hello"));
    }
    
    public static int reverseNum(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            // if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static String reverseStrings(String arr){
        String rev = "";
        for(int i = arr.length() - 1; i >= 0; i-- ){
            rev = rev + arr.charAt(i);
        }
        return rev;
    }
}