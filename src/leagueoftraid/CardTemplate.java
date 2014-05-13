/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leagueoftraid;


public abstract class CardTemplate {
    
    private String name;
    private PlayerType color = PlayerType.NoSet;
    private int north;
    private int south;
    private int east;
    private int west;
    
    public CardTemplate(String name, PlayerType color, int north, int south, int east, int west) {
        this.name = name;
        this.color = color;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }
    
    public void flipCard(){
        if(color == PlayerType.Blue) 
            color = PlayerType.Red; 
        else
            color = PlayerType.Blue;
    }

    public int getNorth() {
        return north;
    }

    public void setNorth(int North) {
        this.north = North;
    }

    public int getSouth() {
        return south;
    }

    public void setSouth(int South) {
        this.south = South;
    }

    public int getEast() {
        return east;
    }

    public void setEast(int East) {
        this.east = East;
    }

    public int getWest() {
        return west;
    }

    public void setWest(int West) {
        this.west = West;
    }
    
    public enum PlayerType {Blue, Red, NoSet}
    public enum FactionType {BandleCity, Bilgewate, Demacia, Freljord, Ionia, Noxus, Piltover, Zaun, NoFaction}
    
}
