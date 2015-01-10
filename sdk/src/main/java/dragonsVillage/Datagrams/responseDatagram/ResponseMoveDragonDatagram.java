package dragonsVillage.Datagrams.responseDatagram;

import dragonsVillage.Enums.EMoveSide;

import java.io.Serializable;

public class ResponseMoveDragonDatagram implements Serializable {
    private long dragonID;
    private int positionX;
    private int positionY;
    private EMoveSide moveSide;

    public ResponseMoveDragonDatagram(long dragonID, int positionX, int positionY, EMoveSide moveSide) {
        this.dragonID = dragonID;
        this.positionX = positionX;
        this.positionY = positionY;
        this.moveSide = moveSide;
    }

    public long getDragonID() {
        return dragonID;
    }

    public void setDragonID(long dragonID) {
        this.dragonID = dragonID;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public EMoveSide getMoveSide() {
        return moveSide;
    }

    public void setMoveSide(EMoveSide moveSide) {
        this.moveSide = moveSide;
    }
}
