public class leet_258 {
    public static void main(String[] args) {
        System.out.println(addDigits(45));}
    static int addDigits(int num) {
        while (num >= 10) {int sum = 0;
            while (num > 0){
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;}
            num = sum;}
        return num;}
}

