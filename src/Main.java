// program to check if the number is palindrome or not
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is Not Palindrome");
        }
    }
}
