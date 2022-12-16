

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Console (1) ou Interface (2) : ");

        int choice = sc.nextInt();
        if (choice == 1){

            Game.Play();

        }else{
            //HelloApplication helloApplication = new HelloApplication();
            //HelloApplication.main();

        }
    }
}