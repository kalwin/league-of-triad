/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leagueoftraid;

import java.util.List;


public class Player {
    
    private String name;
    private List<CardTemplate> deck;
    
    public Player(String name, List<CardTemplate> deck){
        this.name = name;
        this.deck = deck;
    }
    
    public CardTemplate getCard(int selectedCard){
        return deck.get(selectedCard);
    }

    public String getName() {
        return name;
    }
    
    
}
