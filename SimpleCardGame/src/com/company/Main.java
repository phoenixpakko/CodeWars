package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Steve and Josh are bored and want to play something. They don't want to think too much, so they come up with a really simple game. Write a function called winner and figure out who is going to win.
        They are dealt the same number of cards. They both flip the card on the top of their deck. Whoever has a card with higher value wins the round and gets one point (if the cards are of the same value, neither of them gets a point). After this, the two cards are discarded and they flip another card from the top of their deck. They do this until they have no cards left.
        deckSteve and deckJosh are arrays representing their decks. They are filled with cards, represented by a single character. The card rank is as follows (from lowest to highest):
        '2','3','4','5','6','7','8','9','T','J','Q','K','A'
        Every card may appear in the deck more than once. Figure out who is going to win and return who wins and with what score:
        "Steve wins x to y" - if Steve wins, where x is Steve's score, y is Josh's score;
        "Josh wins x to y" - if Josh wins, where x is Josh's score, y is Steve's score;
        "Tie" - if the score is tied at the end of the game.
        */
        System.out.println(winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}));
        System.out.println(winner(new String[]{"T"}, new String[]{"T"}));
    }

    public static String winner(String[] deckSteve, String[] deckJosh) {
        // TODO
        int steve_point = 0, josh_point = 0;

        // Count all players points:
        for (int i = 0; i < deckSteve.length; i++) {
            if (card_value(deckSteve[i]) > card_value(deckJosh[i])) {
                steve_point++;
            }
            else if (card_value(deckSteve[i]) < card_value(deckJosh[i])) {
                josh_point++;
            }
        }

        // Who won?
        if (steve_point > josh_point) {
            return "Steve wins " + steve_point + " to " + josh_point;
        }
        else if (steve_point < josh_point) {
            return "Josh wins " + josh_point + " to " + steve_point;
        }
        return "Tie";
    }

    public static int card_value(String card) {
        // TODO
        switch (card) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "T": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return 0;
        }
    }
}
