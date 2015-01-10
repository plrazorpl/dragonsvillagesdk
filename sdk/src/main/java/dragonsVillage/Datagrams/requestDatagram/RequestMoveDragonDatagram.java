package dragonsVillage.Datagrams.requestDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.Enums.EMoveSide;

import java.io.Serializable;

public class RequestMoveDragonDatagram extends ABaseToUserDatagram implements Serializable {
    private long dragonID;
    private EMoveSide moveSide;

    public RequestMoveDragonDatagram(long mapToBlockID, long dragonID, EMoveSide moveSide) {
        super(mapToBlockID);
        this.dragonID = dragonID;
        this.moveSide = moveSide;
    }

    public long getDragonID() {
        return dragonID;
    }

    public void setDragonID(long dragonID) {
        this.dragonID = dragonID;
    }

    public EMoveSide getMoveSide() {
        return moveSide;
    }

    public void setMoveSide(EMoveSide moveSide) {
        this.moveSide = moveSide;
    }
}
