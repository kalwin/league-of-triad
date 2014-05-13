/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leagueoftraid.Rules;

import leagueoftraid.BoardTemplate;
import leagueoftraid.CardTemplate;


public class Original extends RulesTemplates {

    BoardTemplate board;

    public Original(BoardTemplate board) {
        this.board = board;
    }

    @Override
    public BoardTemplate calculateOutcome(int placeOnTheBoard) {
        CardTemplate lastPlayedCard = board.getCardFromBoard(placeOnTheBoard);

        CardTemplate nCard = board.getNorthCard(placeOnTheBoard);
        CardTemplate eCard = board.getEastCard(placeOnTheBoard);
        CardTemplate sCard = board.getSouthCard(placeOnTheBoard);
        CardTemplate wCard = board.getWestCard(placeOnTheBoard);

        if (nCard!=null && lastPlayedCard.getNorth() > nCard.getSouth()) {
            nCard.flipCard();
        }
        if (eCard!=null && lastPlayedCard.getEast() > eCard.getWest()) {
            eCard.flipCard();
        }
        if (sCard!=null && lastPlayedCard.getSouth() > sCard.getNorth()) {
            sCard.flipCard();
        }
        if (wCard!=null && lastPlayedCard.getWest() > wCard.getEast()) {
            wCard.flipCard();
        }

        return board;
    }

}
