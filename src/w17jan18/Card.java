package w17jan18;


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
public class Card {
    private String faceName, suit;
    private int faceValue;
    
    public Card(String face, String suit, int value)
    {
        faceName = face;
         setSuit(suit);
         setValue(value);
    }
    //this method will return a string to represent the card
    @Override
    public String toString()
    {
        return faceName + "of" + suit;
       
    }
    //This method will validate if the suit is valied ex. hearts diamonds, spades or clubs//
    private void setSuit(String suit)
    {
        if (suit.equalsIgnoreCase("hearts") ||suit.equalsIgnoreCase("diamonds")|| suit.equalsIgnoreCase("spades")|| suit.equalsIgnoreCase("clubs"))
        {
            this.suit=suit;
        }
        else 
            throw new IllegalArgumentException("Suit must be hearts, diamonds,"
                    + "clubs or spaids");
    }
    //This method will validate that the card value is between 2-14//
    private void setValue(int value)
    {
       if (value <2 || value >14)
           throw new IllegalArgumentException("Face value must be 2-14 inclusive");
       else 
           faceValue = value;
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
    /* 
   This method will "shuffle" the deck of cards
    */
  
}
