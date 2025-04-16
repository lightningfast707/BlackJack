import java.util.ArrayList;

import java.util.Collections;

public class Deck 
{
   public static final int NUMFACES = 13;
   public static final int NUMSUITS = 4;
   public static final int NUMCARDS = 52;
   
   public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

   private int topCardIndex;	   
   private ArrayList<Card> stackOfCards;
  	
   // constructor
   public Deck() 	
   {
     //initialize the instance variables
     stackOfCards = new ArrayList<>();
     topCardIndex = NUMCARDS-1;
  
     //one loop to go through all SUITS
        //one loop to go through all FACES
       	//add in each new Card() to the Deck
        for (int i = 0; i < SUITS.length; i++)
        {
            for (int j = 1; j <= NUMFACES; j++)
            {
              stackOfCards.add(new Card(SUITS[i],j));
            }
        }
   }
  	
   public int size()  
   {
      return stackOfCards.size();	
   }
   
   public int numCardsLeft()
   {
      return topCardIndex + 1; 
   }

   public void shuffle()
   {  	   
      //add code to shuffle deck – Collections has a shuffle
      Collections.shuffle(stackOfCards);
      topCardIndex = NUMCARDS-1;
   }
   
   public Card nextCard()
   {   
      if (topCardIndex < 0)
      {
         return null; 
      }
      return stackOfCards.get(topCardIndex--);  
   }  

   public String toString()
   {
      return stackOfCards + " ";
   }

    
}
