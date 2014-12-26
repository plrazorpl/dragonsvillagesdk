package dragonsVillage.dtos;

import dragonsVillage.Enums.EMapPointType;
import dragonsVillage.Enums.EMapType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MapDTO extends ABaseDTO implements Serializable{
    private EMapPointType[][] mapPointTypes;
    private ArrayList<LoginUserDTO>[][] usersMap;
    private ArrayList<LoginUserDTO> usersOnMap;
    private EMapType mapType;
    private long id;

    public EMapPointType[][] getMapPointTypes() {
        return mapPointTypes;
    }

    public void setMapPointTypes(EMapPointType[][] mapPointTypes) {
        this.mapPointTypes = mapPointTypes;
    }

    public ArrayList<LoginUserDTO>[][] getUsersMap() {
        return usersMap;
    }

    public void setUsersMap(ArrayList<LoginUserDTO>[][] usersMap) {
        this.usersMap = usersMap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapDTO mapDTO = (MapDTO) o;

        if (id != mapDTO.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    public ArrayList<LoginUserDTO> getUsersOnMap() {
        return usersOnMap;
    }

    public void setUsersOnMap(ArrayList<LoginUserDTO> usersOnMap) {
        this.usersOnMap = usersOnMap;
    }

    public EMapType getMapType() {
        return mapType;
    }

    public void setMapType(EMapType mapType) {
        this.mapType = mapType;
    }
}
