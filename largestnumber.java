import java.util.Scanner;

public class largestnumber{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("to check largest among 3 number");
          System.out.println("enter 1 number");
             int num=sc.nextInt();
             System.out.println("enter 2 number");
             int num1=sc.nextInt();
             System.out.println("enter 3 number");
             int num2=sc.nextInt();
             if(num>num1&&num>num2){
                System.out.println("number 1 is largest");
             }
             else if(num1>num&&num1>num2){
                 System.out.println("number 2 is largest");

             }
             else{
                 System.out.println("number 3 is largest");
             }
             
      
                
    }
}