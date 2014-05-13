/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leagueoftraid;

import java.util.List;
import leagueoftraid.CardTemplate;
import leagueoftraid.Rules.RulesTemplates;


public class Game {
    
    List<CardTemplate> bluePlayerCards;
    List<CardTemplate> redPlayerCards;
    BoardTemplate board;
    RulesTemplates rules;
    
    public Game(List<CardTemplate> firstPlayerDeck, List<CardTemplate> secondPlayerDeck, BoardTemplate playingBoard, RulesTemplates rules) {
        bluePlayerCards = firstPlayerDeck;
        redPlayerCards = secondPlayerDeck;
        board = playingBoard;
        this.rules = rules;
    }
    
    public void placeCardOnBoard(CardTemplate selectedCard, int placeOnTheBoard){
             if(board.canCardBePlace(placeOnTheBoard))
             {
                 board.putCardOnBoard(selectedCard, placeOnTheBoard);
                 board = rules.calculateOutcome(placeOnTheBoard);
             }
    }
    
}
