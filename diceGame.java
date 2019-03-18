import java.util.Scanner; // Used for user input

// Driver Program to roll two dice until both numbers rolled are equal. 
public class diceGame extends Dice{
  public static void main (String[] args){
      // Create new instance of Dice  
      Dice Dice1 = new Dice();
      // Declare two integers for the two rolls to be thrown. 
      int roll;
      int roll2;
      // Scanner for user input. 
      Scanner sc = new Scanner(System.in);
        
      //Get user input: ask if they want to play a game. 
      System.out.println("Do you want to play a game?");
      char playing = sc.next().charAt(0);
      
      // While loop for answer being Y or y.
      while((playing == 'Y') || (playing == 'y')){
        // Do loop for while is Y or y.
        do{ 
          // Roll the first dice.
            roll = Dice1.rollDice();
          System.out.println("The first throw has rolled " + roll);
        
          // Roll the second dice.
          roll2 = Dice1.rollDice();
          System.out.println("The second throw has rolled " + roll2);
        
          // Report on the two numbers rolled
          Dice1.reportDice();
          
          // Output winner message when both rolls are equal.
          if(roll == roll2) {
            System.out.println("You are a winner");
          }
        }
        while(roll != roll2);{
        }  
        // Once game is over, ask if the user wants to play again.
        // If yes, the while loop repeats. 
        // If no, the program closes. 
        System.out.println("Do you want to play again?");
        playing = sc.next().charAt(0);
      }
  }
}