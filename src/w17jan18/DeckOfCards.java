package w17jan18;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tannerwolfejacobs
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        String[] suits = {"hearts", "diamonds","spades","clubs"};
        String[] faceNames = {"two","three","four","five","six","seven","eight","nine","ten","jack","king","queen","ace"};
        
        
        for (String suit: suits)
        {
            for (int i=0; i < faceNames.length; i++)
            {
                Card newCard = new Card(suit, faceNames [i], i+2);
                deck.add(newCard);
                
            }
        }
    }
    /** 
     * this will return a string representing the deck of cards 
     * 
     */
    public String toString()
    {
        String deckString = "";
        for (Card card : deck)
        {
            deckString += card.toString() + "%n";
        }
        return deckString;
    }
      public void shuffle()
    {
        Collections.shuffle(deck);
        
    }
      /* this method will deal the top card off the deck
      
      */
      public Card dealTopCard()
      {
          if (deck.isEmpty())
              return null;
          else
              return deck.remove(0);
          
      }
}

