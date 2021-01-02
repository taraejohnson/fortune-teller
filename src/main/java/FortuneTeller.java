import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your age?");
        String age = input.nextLine();
        int ageNum = Integer.parseInt(age);

        System.out.println("What is your birth month? Please enter as a number.");
        String birthMonth = input.nextLine();
        int birthMonthNum = Integer.parseInt(birthMonth);

        System.out.println("What is your favorite ROYGBIV color?");
        String favColor = input.nextLine();

        System.out.println("How many siblings do you have?");
        String siblings = input.nextLine();
        int siblingsNum = Integer.parseInt(siblings);

        System.out.println("/n");

        //start fortune display
        System.out.print(firstName + " " + lastName + " will retire in ");

        if (ageNum % 2 == 0){
            System.out.print("20 years");
        }
        else {
            System.out.print("10 years");
        }

        System.out.print(" with ");

        switch (birthMonthNum) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("$1");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.print("$44,000");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.print("$999");
                break;
            default:
                System.out.print("$0.00");
                break;
            }

        System.out.print(" in the bank, a vacation home in ");

        switch (siblingsNum) {
            case 0:
                System.out.print("Berlin, Germany");
                break;
            case 1:
                System.out.print("Guadalupe, Mexico");
                break;
            case 2:
                System.out.print("Vancouver, British Columbia, Canada");
                break;
            case 3:
                System.out.print("Seoul, South Korea");
                break;
            }
            if (siblingsNum > 3) {
                System.out.print("Istanbul, Turkey");
                }
            else if (siblingsNum < 0) {
                System.out.print("Outer Space");
            }

       System.out.print(", and will travel by ");

       if (favColor.equalsIgnoreCase("red")) {
           System.out.print("flying carpet");
       }
       if (favColor.equalsIgnoreCase("orange")) {
           System.out.print("skateboard");
       }
       if (favColor.equalsIgnoreCase("yellow")) {
            System.out.print("Megabus");
       }
       if (favColor.equalsIgnoreCase("green")) {
            System.out.print("foot");
       }
       if (favColor.equalsIgnoreCase("blue")) {
            System.out.print("paraglider");
       }
       if (favColor.equalsIgnoreCase("indigo")) {
            System.out.print("space shuttle");
       }
       if (favColor.equalsIgnoreCase("violet")) {
            System.out.print("hoverboard");
       }

       System.out.print(".");
       System.out.println();
       System.out.println();
    }
}


