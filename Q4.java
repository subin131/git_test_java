import java.util.Scanner;
public class Q4{
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number");
        int x;
        x = input.nextInt();
        if (x % 2 ==0 && x % 5 == 0){
            System.out.println("The value of x is both even and divisible by 5");
        }
        else if (x % 2 ==0){
            System.out.println("The value of x is even but not divisible by 5");
        }
        else if (x % 5 ==0){
            System.out.println("The value of x is divisible by 5 but not even ");
        }
        
        else{
            System.out.println("the number is odd");
        }
    }
}