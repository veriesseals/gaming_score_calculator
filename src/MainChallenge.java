public class MainChallenge {

    // This is actually the first method below. Every thing included in public static void main(String[] args) throws Exception {}
    // --------------------------------------------------------------
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        // Call the 2nd Method created
        // --------------------------------------------------------------
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); // Implement arguments made from parameters set in Method 2. Variable name and value will make up the arguments here.
        System.out.println("The highScore is " + highScore);

        // Do not redeclare variable, just change them on this step
        // --------------------------------------------------------------
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        
        // Output the second score using an expression rather than assigning it a variable
        // --------------------------------------------------------------
        System.out.println("The next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));
    }
    
    // Create our 2nd method below the first method
    // --------------------------------------------------------------
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // add the parameters (variable type and name separated by commas)
        
        int finalScore = score;
        
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        // add a return
        return finalScore;
    }
}
