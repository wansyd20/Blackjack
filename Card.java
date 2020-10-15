/*
Sydney Wan, Shelby Chang, Maya Mandyam
AP CS A
Lab 10: Blackjack
2/7/20

Card Class
*/

public class Card {
   //fields
   private int value;
   private int numberValue;
   private int suit;
   private String suitName;
   
   public Card(int value, int suit) {
      this.value = value;
      this.suit = suit;
      //makes sure that if there is a Jack, Queen, or King, the numerical value when played still equals 10
      if (this.value == 11 ||this.value == 12 ||this.value == 13) {
         numberValue = 10;
      }
      else {
         numberValue = value;
      }
      //Determines the name of the suit based on the corresponding integer of the suit
      if (this.suit == 1) {
         suitName = "Clubs";
      }
      else if (this.suit == 2) {
         suitName = "Diamonds";
      }
      else if (this.suit == 3) {
         suitName = "Hearts";
      }
      else {
         suitName = "Spades";
      }      
   }
   
   
   public int getNumberValue() {
      return this.numberValue;
   }
   
   public int getSuit() {
      return this.suit;
   }
   
   //prints the value and suit of the given card
   public String toString() {
      if (this.value == 1) {
         return "Ace of " + this.suitName;
      }
      if (this.value == 11) {
         return "Jack of " + this.suitName;
      }
      else if (this.value == 12) {
         return "Queen of " + this.suitName;
      }
      else if (this.value == 13) {
         return "King of " + this.suitName;
      }
      return this.value + " of " + this.suitName;
   }
      

}