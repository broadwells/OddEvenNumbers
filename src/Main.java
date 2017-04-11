import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! What is your name?");
        String userName = scan.nextLine();

        int userNum;
        boolean userPrompt = true;
        while (userPrompt) {    //initialized to true, allowing for the user to input until they are done
            System.out.println(userName + ", please enter an integer between 1 and 100: ");
            userNum = scan.nextInt();

            if (userNum < 0 || userNum > 100) {     //validating for positive numbers between 1 and 100 only
                System.out.println("Invalid, please enter an integer between 1 and 100");
            }

            else {
                if (userNum % 2 == 1) {
                    if (userNum < 60) {
                        System.out.println(userNum + " and Odd");
                    }
                    else {
                        System.out.println(userNum + ", Odd and over 60");
                    }
                }
                else {
                    if (userNum >= 2 && userNum < 25) {
                        System.out.println(userNum + ", Even and less than 25");
                    }
                    else if (userNum >= 26 && userNum <= 60) {
                        System.out.println("Even");
                    }
                    else {
                        System.out.println(userNum + " and Even");
                    }
                }
            }
            //parameter for ending the program officially when user inputs "n"
            System.out.println(userName + ", would you like to continue? (y/n): ");
            String userContinue = scan.next();

            if (userContinue.equals("n")) {
                System.out.println("Goodbye, " + userName + "!");
                userPrompt = false;
            }

        }
    }
}
