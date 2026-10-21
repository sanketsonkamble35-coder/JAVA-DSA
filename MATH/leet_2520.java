import java.util.Scanner;
public class leet_2520 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("enter number:");
        int a=i.nextInt();
        System.out.println(countDigits(a));
    }
    static int countDigits(int num) {
        int count=0;
        for(int i=num;i>0;i=i/10){
            int dig=i%10;
            if(num%dig==0){count++;}
        }
        return count;
    }

}
// 2520. Count the Digits That Divide a Number
// Given an integer num, return the number of digits in num that divide num.

// An integer val divides nums if nums % val == 0.
// Example 1:
// Input: num = 7
// Output: 1
// Explanation: 7 divides itself, hence the answer is 1.

// Example 2:
// Input: num = 121
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

// Example 3:
// Input: num = 1248
// Output: 4
// Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
// Constraints:
// 1 <= num <= 109
// num does not contain 0 as one of its digits.