package BusinessLogic;

import java.util.ArrayList;
import java.util.Scanner;


class Menu{
    public static void main(String[] args) {

        MenuMethods menuMeth = new MenuMethods();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Sign in");
        System.out.println("2.Sign up");
        int signTask = scan.nextInt();
        while(signTask!=0){
            switch(signTask){
                case 1:
                    System.out.println("Enter your order number");
                    break;
                case 2:
                    ArrayList<String> personDetails = menuMeth.perDetails();
                    String event = menuMeth.eventType();
                    int[] attendees = menuMeth.numbAdultsKids();
                    ArrayList<String> menuItem = menuMeth.menuDetails();
                    String theme = menuMeth.theme();
                    break;
            }
            
            System.out.println("\f");
            System.out.println();
            System.out.println("1.Sign in");
            System.out.println("2.Sign up");
            signTask = scan.nextInt();
        }
    }
}