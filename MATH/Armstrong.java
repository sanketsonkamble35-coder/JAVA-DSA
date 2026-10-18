import java.util.*;
public class Armstrong{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number:");
    int a=sc.nextInt();
    int original=a;
    int count=String.valueOf(a).length();
    int sum=0;

    //armstrong number
    while (a>0) {
        int digit=a%10;
        sum=sum+(int)Math.pow(digit,count);
        a=a/10;
    }
    if(sum==original){
        System.out.println(original+" is a armstrong number");
    }else{
        System.out.println(original+" Not armstrong number");
    }

    // System.out.print("Enter a number whose table you want to print: ");
    // int n1=sc.nextInt();
//     for(int i=1;i<=10;i++){
//         System.out.println(n1*i);
// }
 }
}