import java.util.Scanner;
/**
 * asks the user for an integer, creates a hailstone pattern starting with that integer
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner to get the user's input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int number; //the number provided by the user
    int remainder; //the remainder of the number divided by 2

    //ask user for number
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    number = input.nextInt();


    //tell user the sequence is starting
    System.out.println("Hailstone sequence is the following:");
    //print the starting number to the screen
    System.out.println(number);

    do{
        //get remainder of number divided by 2
        remainder = number % 2; //0 if even, 1 if odd

        //check if number is even
        if(remainder == 0){
          number = number/2; //if number is even divide it by 2
        }else{ // if the number is odd
          number = number*3 + 1; //multiply by 3 and add 1
        }

        //tell user the numbers current value
        System.out.println(number);
    }while(number != 1); //if number is not 1, repeat
  }
}
