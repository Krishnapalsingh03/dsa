import java.util.Scanner;

public class fibonachiseries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element for seires to find it value ");
        int num=sc.nextInt();
        int a=0,b=1;
     
        for(int i=2;i<num;i++){
             
                int c=a+b;
                    a=b;
                    b=c;
            System.out.println(c);
               
        }
        
      

    }
}