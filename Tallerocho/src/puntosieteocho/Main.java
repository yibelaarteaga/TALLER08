package puntosieteocho;

import java.util.Scanner;

public class Main {
	
	  public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    int points = 0;
	    int numCards = 2;

	    Card[] hand = new Card[5];
	    for (int i = 0; i < numCards; i++) {
	      int suitNumber = (int) (Math.random() * 4.0 + 1);
	      int faceNumber = (int) (Math.random() * 13.0 + 1);
	      Card newCard = new Card(suitNumber, faceNumber);
	      hand[i] = newCard;
	      points += newCard.points;
	      System.out.println("Card " + (i+1) + ": " + newCard + ", Points: " + newCard.points);
	    }
	    System.out.println("Total points: " + points);

	    while (points < 21 && numCards < 5) {
	      System.out.print("Do you want another card? (Y/N): ");
	      String answer = input.nextLine().toUpperCase();
	      if (answer.equals("Y")) {
	        int suitNumber = (int) (Math.random() * 4.0 + 1);
	        int faceNumber = (int) (Math.random() * 13.0 + 1);
	        Card newCard = new Card(suitNumber, faceNumber);
	        hand[numCards] = newCard;
	        points += newCard.points;
	        System.out.println("Card " + (numCards+1) + ": " + newCard + ", Points: " + newCard.points);
	        numCards++;
	        System.out.println("Total points: " + points);
	      } else {
	        break;
	      }
	    }
	    System.out.println("Final hand: ");
	    for (int i = 0; i < numCards; i++) {
	      System.out.println(hand[i]);
	    }
	    System.out.println("Total points: " + points);
	  }
	}


