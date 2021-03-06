package dragonsVillage.dtos;

import dragonsVillage.Enums.EMoveSide;
import dragonsVillage.Enums.EPlayerSkin;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class LoginUserDTO extends ABaseDTO implements Serializable {
    private long id;
    private String login;
    private EPlayerSkin skin;
    private int positionX;
    private int positionY;
    private MapDTO currentMap;
    private long mapID;
    private int actualSharpX;
    private int actualSharpY;
    private ArrayList<Long> dragonsElements = new ArrayList<>();
    private EMoveSide moveSide;
    private Image playerSkin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginUserDTO that = (LoginUserDTO) o;

        if (id != that.id) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (login != null ? login.hashCode() : 0);
        return result;
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

    public EPlayerSkin getSkin() {
        return skin;
    }

    public void setSkin(EPlayerSkin skin) {
        this.skin = skin;
    }

    public MapDTO getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(MapDTO currentMap) {
        this.currentMap = currentMap;
    }

    public long getMapID() {
        return mapID;
    }

    public void setMapID(long mapID) {
        this.mapID = mapID;
    }

    public int getActualSharpX() {
        return actualSharpX;
    }

    public void setActualSharpX(int actualSharpX) {
        this.actualSharpX = actualSharpX;
    }

    public int getActualSharpY() {
        return actualSharpY;
    }

    public void setActualSharpY(int actualSharpY) {
        this.actualSharpY = actualSharpY;
    }

    public ArrayList<Long> getDragonsElements() {
        return dragonsElements;
    }

    public void setDragonsElements(ArrayList<Long> dragonsElements) {
        this.dragonsElements = dragonsElements;
    }

    public EMoveSide getMoveSide() {
        return moveSide;
    }

    public void setMoveSide(EMoveSide moveSide) {
        this.moveSide = moveSide;
    }

    public Image getPlayerSkin() {
        return playerSkin;
    }

    public void setPlayerSkin(Image playerSkin) {
        this.playerSkin = playerSkin;
    }
}
