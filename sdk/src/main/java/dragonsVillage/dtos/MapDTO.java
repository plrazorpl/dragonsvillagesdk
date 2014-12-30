package dragonsVillage.dtos;

import dragonsVillage.Enums.EMapPointType;
import dragonsVillage.Enums.EMapType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapDTO extends ABaseDTO implements Serializable{
    private EMapPointType[][] mapPointTypes;
    private ArrayList<LoginUserDTO>[][] usersMap;
    private ArrayList<LoginUserDTO> usersOnMap;
    private EMapType mapType;
    private long id;
    private ArrayList<Long> dragonsOnMap = new ArrayList<>();
    private HashMap<Long,DragonDTO> dragonsDTO = new HashMap<>();
    private ArrayList<DragonDTO>[][] dragonsMap;

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

    public ArrayList<Long> getDragonsOnMap() {
        return dragonsOnMap;
    }

    public void setDragonsOnMap(ArrayList<Long> dragonsOnMap) {
        this.dragonsOnMap = dragonsOnMap;
    }

    public HashMap<Long, DragonDTO> getDragonsDTO() {
        return dragonsDTO;
    }

    public void setDragonsDTO(HashMap<Long, DragonDTO> dragonsDTO) {
        this.dragonsDTO = dragonsDTO;
    }

    public ArrayList<DragonDTO>[][] getDragonsMap() {
        if(dragonsMap == null) {
            //TODO: fix table size
            dragonsMap = new ArrayList[mapPointTypes.length][mapPointTypes.length];
        }
        return dragonsMap;
    }

    public void setDragonsMap(ArrayList<DragonDTO>[][] dragonsMap) {
        this.dragonsMap = dragonsMap;
    }
}
