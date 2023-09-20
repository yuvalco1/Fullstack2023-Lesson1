import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create 3 variables for first name, last name, age and print them

        String firstName = "Yuval";
        String lastName = "Cohen";
        int age = 53;

        System.out.println(firstName+" "+lastName+ " age is:"+ age );

        // Exercise - to print true in case i finished school more than 10 years ago , otherwise flase

        int yearsAgo = 15;
        System.out.println(yearsAgo >= 10);

        // get from user 3 variables for first name, last name, age and print them

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your First name: ");
        String infirstName = scanner.nextLine();
        System.out.println("Please enter your Last name: ");
        String inlastName = scanner.nextLine();
        System.out.println("Please enter your age in years: ");
        int inage = scanner.nextInt();

        System.out.println(infirstName+" "+inlastName+ " age is:"+ inage );

        // More operators

        int x= 8;
        x++; // 8+1 =9
        x/=3; // 9/3 = 3
        x*=4; // 3*4 =12
        x--; //12-1 =11
        System.out.println(x);

        // Exercise with Module
        // Input number between 10 and 99 , Change the order of its digits and print a new number.
        System.out.println("Please enter a number between 10 and 99: ");
        int innumber = scanner.nextInt();
        int leftdigit = innumber/10;
        int rightdigit = innumber%10;
        int newnumber = rightdigit*10+leftdigit;
        System.out.println("New number is: "+newnumber);


        //Input float number can be not natural like 4.1 , Print the closest even number which is higher than initial number. Example: input 4.1 -> output : 6
        System.out.println("Please enter a float number: ");
        float infloat = scanner.nextFloat();
        int evennum = (int) (infloat/2);
        System.out.println("The closeset even number is: "+ (evennum*2+2) );





    }
}