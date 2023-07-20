import java.util.ArrayList;
import java.util.List;

public class Player { //class for the player
    String name;
    int row;
    int col;
    List<Card> playerHand;

    public Player(String name, int xCoord, int yCoord){ // constructor for Player object
        this.name = name;
        this.row = xCoord;
        this.col = yCoord;
        this.playerHand = new ArrayList<>(); // create a new hand for each new player
    }

    public String getPlayerName(){ // getter method to get player name
        return name;
    }

    public int getX(){ // getter method to get player x coord
        return row;
    }

    public int getY(){ // getter method to get player y coord
        return col;
    }

    public List<Card> getPlayerHand(){ // getter method to get player hand
        return playerHand;
    }

    public void addCard(Card card){ // add cards to player hand
        playerHand.add(card);
    }
}
