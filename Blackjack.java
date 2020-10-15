/*
Sydney Wan, Shelby Chang, Maya Mandyam
AP CS A
Lab 10: Blackjack
2/14/20

Blackjack Class: client code
*/

import java.util.Scanner;

public class Blackjack {
   public static void main(String[] args) {
      // create Scanner
      Scanner scan = new Scanner(System.in);
      
      // welcome message
      System.out.println("Welcome to Blackjack!");
      
      // prompt user for player names
      System.out.print("Please enter the name of player 1: ");
      String name1 = scan.next();
      System.out.print("Please enter the name of player 2: ");
      String name2 = scan.next();
      
      // create player objects
      Player player1 = new Player(name1);
      Player player2 = new Player(name2);
      
      System.out.println("==============");
      
      Deck deck = new Deck();
      player1.newHand(deck);
      player2.newHand(deck);
     
      // show first card
      System.out.println(player1.getName() + " shows: " + player1.getHand().getFirstCard());
      System.out.println(player2.getName() + " shows: " + player2.getHand().getFirstCard());
      
      System.out.println();
      
      System.out.println(player1.getName() + ", it is your turn.");
      System.out.println(player1);
      System.out.println("Do you want to [h]it or [s]tand?");
      String action = scan.next();
      
      while (action.equals("h")) {
         player1.hit(deck);
         System.out.println(player1);
         if (player1.toString().equals("Bust!")) {
            action = "s";
         }
         System.out.println("Do you want to [h]it or [s]tand?");
         action = scan.next();
      }
      
      System.out.println("==============");
      
      System.out.println(player1.getName() + " shows: " + player1.getHand().getFirstCard());
      System.out.println(player2.getName() + " shows: " + player2.getHand().getFirstCard());
      
      System.out.println();
      
      System.out.println(player2.getName() + ", it is your turn.");
      System.out.println(player2);
      if (player2.toString().equals("Bust!")) {
            action = "s";
         }
      System.out.println("Do you want to [h]it or [s]tand?");
      action = scan.next();
      
      while (action.equals("h")) {
         player2.hit(deck);
         System.out.println(player2);
         System.out.println("Do you want to [h]it or [s]tand?");
         action = scan.next();
      }      
        
   }
}