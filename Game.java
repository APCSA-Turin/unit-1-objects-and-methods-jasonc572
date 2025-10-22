public class Game {
    //instance variables
   private String gameName;
   private int players;
   private int score;

   // constructor
   public Game(String name, int player) {
        gameName = name;
        players = player;
        score = 0;
   }

   // getter method
   public String getGameName() {
       return gameName;
   }
   public int getPlayers() {
       return players;
   }
   public int getScore() {
       return score;
   }

    public void addPlayer(){
    players++;
    }
    
   public void increaseScore(int increase) {
       score = score + increase;
   }

   public double averageScorePerPlayer() {
        return ((double)score) / players;
   }

   public boolean isGameOver() {
    if (score > 9) {
        return true;
    } else {
        return false;
    }


   }

}

