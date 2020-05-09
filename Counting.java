import java.util.Scanner;
public class Counting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number less tahn ten billions");
        long num;
        num=sc.nextLong();
        int count=0;
        while(num >0){
            num/=10;
            count++;
        }
        System.out.println("Number of digits is  "+count);
    }
}
        