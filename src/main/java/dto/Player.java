package dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Player implements Comparable<Player>{
    private Integer playerId;
    private Integer ClubId;
    private Integer number;
    private String playerName;
    private String playerSurname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerId, player.playerId) && Objects.equals(ClubId, player.ClubId) && Objects.equals(number, player.number) && Objects.equals(playerName, player.playerName) && Objects.equals(playerSurname, player.playerSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, ClubId, number, playerName, playerSurname);
    }


    /* @Override
    public int compareTo(Player player){
        return  this.getPlayerId()-player.getPlayerId();
    }*/


    @Override
    public int compareTo(Player player){
        return  this.getPlayerName().compareTo(player.getPlayerName());
    }
}
