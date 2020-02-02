package com.company;

public class Card {

    private Suits suit;
    private String rank;
    private int points;

    public enum Suits {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS,
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }




//    public void determineCard () {
//        String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs" };
//        String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//        String[] card = new String[2];
//        for (int i = 0; i<card.length; i++) {
//            card[i] = rank[i] + suit[i];
//            System.out.println(card[i]);
//        }



    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
