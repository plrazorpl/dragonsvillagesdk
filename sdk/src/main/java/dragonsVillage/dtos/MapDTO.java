package dragonsVillage.dtos;

import dragonsVillage.Enums.EMapPointType;

import java.io.Serializable;

public class MapDTO implements Serializable{
    private EMapPointType[][] mapPointTypes;
    private LoginUserDTO[][] usersMap;

    public EMapPointType[][] getMapPointTypes() {
        return mapPointTypes;
    }

    public void setMapPointTypes(EMapPointType[][] mapPointTypes) {
        this.mapPointTypes = mapPointTypes;
    }

    public LoginUserDTO[][] getUsersMap() {
        return usersMap;
    }

    public void setUsersMap(LoginUserDTO[][] usersMap) {
        this.usersMap = usersMap;
    }
}
