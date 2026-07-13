import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check armstrong number");
        int num=sc.nextInt();
        int result=0;
        int original=num;
        while(num>0){
            int rem=num%10;
            num=num/10;
            result=result+(rem*rem*rem);
        }
        if(original==result){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

    }
}
