public class Card
{
   public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

   private String suit;
   private int face;
   

   //constructors
   public Card(String s, int f)
   {
      this.suit = s;
      this.face = f;
   }

   //set methods

   //get methods 
   public int getValue()
   {
     return face;
   }
   public String getSuit()
   {
    return suit;
   }
    
   //equals method
   public boolean equals(Object obj)
   {   
      return super.equals(obj);
   }


   public String toString()
   {
     return FACES[face] + " of " + getSuit() + " | value = " + getValue();
   }
 }

class BlackJackCard extends Card
{

   //constructors
   public BlackJackCard(int value,String name)
   {
     super(name,value);
   }
   public int getValue()
   {   
      //override the Card getValue to build BlackJack logic
      //enables you to build the value for the game into the card
      //this makes writing the whole program a little easier

      return super.getValue();
   }
}

