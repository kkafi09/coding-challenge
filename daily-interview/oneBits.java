public class oneBits{
    public static void main(String[] args){
        System.out.println(one_bits(23));
    }

    public static int one_bits(int number){
        String convert = Integer.toBinaryString(number);

        int one = 0;
        int zero = 0;

        for(int i = 0;i< convert.length(); i++){
            if(convert.charAt(i) == '1'){
                one++;
            } else{
                zero++;
            }
        }

        return one;
    }
}