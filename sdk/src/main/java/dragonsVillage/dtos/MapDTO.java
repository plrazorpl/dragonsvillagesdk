package dragonsVillage.dtos;

import dragonsVillage.Enums.EMapPointType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MapDTO implements Serializable{
    private EMapPointType[][] mapPointTypes;
    private List<LoginUserDTO>[][] usersMap;
    private List<LoginUserDTO> usersOnMap = new ArrayList<>();
    private long id;

    public EMapPointType[][] getMapPointTypes() {
        return mapPointTypes;
    }

    public void setMapPointTypes(EMapPointType[][] mapPointTypes) {
        this.mapPointTypes = mapPointTypes;
    }

    public List<LoginUserDTO>[][] getUsersMap() {
        return usersMap;
    }

    public void setUsersMap(List<LoginUserDTO>[][] usersMap) {
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

    public List<LoginUserDTO> getUsersOnMap() {
        return usersOnMap;
    }

    public void setUsersOnMap(List<LoginUserDTO> usersOnMap) {
        this.usersOnMap = usersOnMap;
    }
}
