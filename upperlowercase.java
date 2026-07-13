import java.util.Scanner;

public class upperlowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer letter");
        char a=sc.next().trim().charAt(0);
        if(a>='A'&&a<='Z'){
            System.out.println("letter is uppeer case");
        }
        else if(a>='a'&&a<='z'){
            System.out.println("letter is lowercase");
        }
        else {
            System.out.println("not a letter");
        }


    }
}
