/*
Sydney Wan, Shelby Chang, Maya Mandyam
AP CS A
Lab 10: Blackjack
2/14/20

Hand Class
*/

import java.util.ArrayList;

public class Hand {
   private ArrayList<Card> cards;
   private int total;
   
   //creates a new hand and automatically adds two cards to the hand to begin with
   public Hand(Deck deck) {
      this.cards = new ArrayList<Card>();
      this.cards.add(deck.drawCard());
      this.cards.add(deck.drawCard());
   }
   
   //gets the first card in the hand
   public Card getFirstCard() {
      return this.cards.get(0);
   }
   
   public Card getLastCard() {
      return this.cards.get(cards.size() - 1);
   }
   
   //calculates the numerical total in a hand
   public int getTotal() {
      this.total = 0;
      for (int card = 0; card < cards.size(); card++) {
         this.total += cards.get(card).getNumberValue();
      }
      return this.total;
   }
   
   //adds a card to the hand
   public void addCard(Deck deck) {
      this.cards.add(deck.drawCard());
   }
   
   
   //gets all of the cards in the hand to print out
  
   public ArrayList<Card> getCards() {
      return cards;
   }    
   
}