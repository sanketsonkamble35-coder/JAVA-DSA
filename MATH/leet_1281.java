import java.util.Scanner;

class leet_1281 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the number(only integers allowed.):");
        int o=sc.nextInt();
        System.out.println(subtractProductAndSum(o));
    }
    static  int subtractProductAndSum(int n) {
        int add=0;int mul=1;
        while(n>0){int digit=n%10; add=add+digit; mul=mul*digit; n=n/10;}
        int output=mul-add;
        return output;}}

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
// Example 1:
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

// Example 2:
// Input: n = 4421
// Output: 21
// Explanation: 
// Product of digits = 4 * 4 * 2 * 1 = 32 
// Sum of digits = 4 + 4 + 2 + 1 = 11 
// Result = 32 - 11 = 21
 
// Constraints:
// 1 <= n <= 10^5