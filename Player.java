/*
Sydney Wan, Shelby Chang, Maya Mandyam
AP CS A
Lab 10: Blackjack
2/14/20

Player class
*/

import java.util.ArrayList;

public class Player {
   private String name;
   private double wins;
   private double losses;
   private Hand hand;
   
   // constructors
   public Player(String name, double wins, double losses) {
      this.name = name;
      this.wins = wins;
      this.losses = losses;
   }
   
   public Player(String name) {
      this(name, 0.0, 0.0);
   }
   
   public Player() {
      this("John Doe");
   }
   
   public void newHand(Deck deck) {
      this.hand = new Hand(deck);
   }
   
   public Hand getHand() {
      return this.hand;
   }
   
   // toString method
   public String toString() {
      if (this.getHand().getTotal() > 21) {
         return "Bust!";
      }
      else {
         return (this.getName() + ", you have " + this.getHand().getCards() + " (" + this.getHand().getTotal() + ")");
      }
   }
   
   // get methods/accessors
   public String getName() { 
      return this.name;
   }
   
   public double getwins() { 
      return this.wins;
   }
   
   public double getLosses() { 
      return this.losses;
   }
   
   // set methods/mutators
   public void setName(String newName) {
      this.name = newName;
   }
   
   public void addWin() {
      this.wins++;
   }
   
   public void addLoss() {
      this.losses++;
   }
   
   public void addTie() {
      this.wins += 0.5;
   } 
   
   // behaviors
   public void hit(Deck deck) {
      hand.addCard(deck);
      System.out.println("You drew " + this.getHand().getLastCard());
   }
}
   