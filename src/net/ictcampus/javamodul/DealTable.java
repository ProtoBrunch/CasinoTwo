package net.ictcampus.javamodul;
import static net.ictcampus.javamodul.CasinoTwo.*;

/**
 *
 *
 */
class DealTable {
    private String nameOfTable;
    private Game activity;
    private Employee croupier;
    private Player[] players = new Player[10];
    private int pot;
    private int numbersOfPeopleAtTable;
    private int gugus;

    DealTable(String nameOfTable,Game game, Employee employee){
        this.nameOfTable = nameOfTable;
        this.activity = game;
        this.croupier = employee;
    }

    // If called, this Method iterates through the Player[]-Array and calls the play()-method of the activity given. Once the iteration reaches as NULL-point, the method breaks.
    void play(){
        for (Player player: players) {
            if(player != null){
                textausgaben.askPlayerToPlaceBet(player);
                pot = player.putAtStake(benutzereingaben.playerPlacesBet());
                if(activity.play()){
                    player.earnCredits(activity.payWin(pot));
                }
            }else{
                break;
            }
        }
    }

    // If called, this Method tries to add a Player-Object to the Player[]-Array. If the Array is full, a text is printed to the console that the Array is full.
    void addPlayer(Player player){
        if(numbersOfPeopleAtTable < 10 && player != null){
            players[numbersOfPeopleAtTable] = player;
            numbersOfPeopleAtTable++;
        }else{
            textausgaben.maxPeopleAtTable();
        }
    }

    void showInfos(){
        textausgaben.showTableInfos(nameOfTable, activity, croupier, numbersOfPeopleAtTable);
    }
}