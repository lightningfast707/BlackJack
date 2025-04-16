import java.util.ArrayList;

public class Player 
{
   private ArrayList<Card> hand;
   private int winCount;

   public Player ()
   {
      hand = new ArrayList<Card>();
      this.winCount = 0;
   }

   public Player (int score)
   {
      hand = new ArrayList<Card>();
      this.winCount = score;
   }

   public void addCardToHand( Card temp )
   {
      hand.add(temp);
   }

   public void resetHand( )
   {
      hand.clear();
   }

   public  void setWinCount( int numwins )
   {
      this.winCount = numwins;
   }

   public int getWinCount() 
   {
     return winCount; 
   }

   public int getHandSize() 
   { 
     return hand.size(); 
   }

   public int getHandValue()
   {
      int value = 0;
      for (int i = 0; i < hand.size(); i++)
      {
        value+= hand.get(i).getValue();
      }
      return value;
   }

   public boolean hit( )
   {
      return false;
   }

   public String toString()
   {
      return "Hand:" + "" + hand + "-" + "" + getHandValue();
   }

}
