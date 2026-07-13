import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//this is multidemesional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Create 2 rows
        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println("Enter  numbers:");

        // Input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        // Display
        System.out.println(list);
    }
}