package dragonsVillage.Datagrams.responseDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.Enums.EMoveSide;

import java.io.Serializable;

public class ResponseUserMoveToUserDatagram implements Serializable {

    private long userID;
    private int x;
    private int y;
    private int speed;
    private EMoveSide moveSide;

    public ResponseUserMoveToUserDatagram(long userID, int x, int y, int speed, EMoveSide moveSide) {
        this.userID = userID;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.moveSide = moveSide;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponseUserMoveToUserDatagram that = (ResponseUserMoveToUserDatagram) o;

        if (speed != that.speed) return false;
        if (x != that.x) return false;
        if (y != that.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "MoveDatagram{" +
                "x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public EMoveSide getMoveSide() {
        return moveSide;
    }

    public void setMoveSide(EMoveSide moveSide) {
        this.moveSide = moveSide;
    }
}
