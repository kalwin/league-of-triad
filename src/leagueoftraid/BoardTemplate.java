/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leagueoftraid;


public abstract class BoardTemplate {
    
    public abstract boolean canCardBePlace(int placeOnTheBoard);
    public abstract boolean isPlaceFree(int placeOnTheBoard);
    public abstract void putCardOnBoard(CardTemplate card, int placeOnTheBoard);
    public abstract CardTemplate getCardFromBoard(int placeOnTheBoard);
    public abstract CardTemplate getNorthCard(int placeOnTheBoard);
    public abstract CardTemplate getSouthCard(int placeOnTheBoard);
    public abstract CardTemplate getEastCard(int placeOnTheBoard);
    public abstract CardTemplate getWestCard(int placeOnTheBoard);
    
}
