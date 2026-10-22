import java.util.*;
public class leet_412{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        int a=in.nextInt();
        System.out.println(fizzBuzz(a));
    }
    static  List<String> fizzBuzz(int n) {
        String[] arr=new String[n];
        for (int i=0;i<n;i++){
            if((i+1)%5==0 && (i+1)%3==0){arr[i]="FizzBuzz";}
            else if((i+1)%5==0){arr[i]="Buzz";}
            else if((i+1)%3==0){arr[i]="Fizz";}
            else{arr[i]=String.valueOf(i+1);}}
        return Arrays.asList(arr);
    }
}

// 412. Fizz Buzz
// Given an integer n, return a string array answer (1-indexed) where:

// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.
 
// Example 1:
// Input: n = 3
// Output: ["1","2","Fizz"]

// Example 2:
// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]

// Example 3:
// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 
// Constraints:
// 1 <= n <= 104