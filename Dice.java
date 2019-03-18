import java.util.Random;
public class Dice {
    int faceUp;
    Random rand = new Random();
    
    public int rollDice() {
        // roll = randomly generated number between 1 and 6. 
        int roll = rand.nextInt(6) + 1;
        
        // Initialise faceUp as the randomly generated number.
        faceUp = roll;
        
        // Return the randomly generated number. 
        return faceUp;
    }
    
    public int reportDice() {
        // Return the randomly generated number. 
        return faceUp;
    }
}