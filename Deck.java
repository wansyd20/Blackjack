/*
Sydney Wan, Shelby Chang, Maya Mandyam
AP CS A
Lab 10: Blackjack
2/14/20

Deck Class
*/

public class Deck {
   // fields
   private Card[] deck;
   private int used;
   
   // constructor
   public Deck() {
      deck = new Card[52];
      int cardCount = 0;
      for (int suit = 1; suit <= 4; suit++) {
         for (int value = 1; value <= 13; value++) {
            deck[cardCount] = new Card(value, suit);
            cardCount++;
         }
      }
      shuffle();
      used = 0;       
   }
   
   // This shuffles the deck before a card is drawn
   public void shuffle() {
      for (int i = 0; i < 52; i++) {
         int random = (int)(Math.random() * i) + 1;
         Card hold = deck[i];
         deck[i] = deck[random];
         deck[random] = hold;
      }
      used = 0;
   }
   
   // This method gets a random card
   public Card drawCard() {
      if (used == 52) {
         shuffle();
      }
      used++;
      return deck[used - 1];
   }
}