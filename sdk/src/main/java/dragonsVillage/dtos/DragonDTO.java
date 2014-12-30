package dragonsVillage.dtos;

import dragonsVillage.Enums.EDragonType;

import java.awt.*;
import java.io.Serializable;

public class DragonDTO extends ABaseDTO implements Serializable{

    private Long id;
    private String name;
    private int positionX;
    private int positionY;

    private int actualSharpX;
    private int actualSharpY;

    private Long userID;

    private Long mapID;

    private EDragonType dragonType;
    private Image dragonSkin;

    public DragonDTO(long id, String name, Long mapID, EDragonType dragonType) {
        this.id = id;
        this.name = name;
        this.mapID = mapID;
        this.dragonType = dragonType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getMapID() {
        return mapID;
    }

    public void setMapID(Long mapID) {
        this.mapID = mapID;
    }

    public EDragonType getDragonType() {
        return dragonType;
    }

    public void setDragonType(EDragonType dragonType) {
        this.dragonType = dragonType;
    }

    public Image getDragonSkin() {
        return dragonSkin;
    }

    public void setDragonSkin(Image dragonSkin) {
        this.dragonSkin = dragonSkin;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DragonDTO dragonDTO = (DragonDTO) o;

        if (actualSharpX != dragonDTO.actualSharpX) return false;
        if (actualSharpY != dragonDTO.actualSharpY) return false;
        if (positionX != dragonDTO.positionX) return false;
        if (positionY != dragonDTO.positionY) return false;
        if (dragonSkin != null ? !dragonSkin.equals(dragonDTO.dragonSkin) : dragonDTO.dragonSkin != null) return false;
        if (dragonType != dragonDTO.dragonType) return false;
        if (id != null ? !id.equals(dragonDTO.id) : dragonDTO.id != null) return false;
        if (mapID != null ? !mapID.equals(dragonDTO.mapID) : dragonDTO.mapID != null) return false;
        if (name != null ? !name.equals(dragonDTO.name) : dragonDTO.name != null) return false;
        if (userID != null ? !userID.equals(dragonDTO.userID) : dragonDTO.userID != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + positionX;
        result = 31 * result + positionY;
        result = 31 * result + actualSharpX;
        result = 31 * result + actualSharpY;
        result = 31 * result + (userID != null ? userID.hashCode() : 0);
        result = 31 * result + (mapID != null ? mapID.hashCode() : 0);
        result = 31 * result + (dragonType != null ? dragonType.hashCode() : 0);
        result = 31 * result + (dragonSkin != null ? dragonSkin.hashCode() : 0);
        return result;
    }
}
