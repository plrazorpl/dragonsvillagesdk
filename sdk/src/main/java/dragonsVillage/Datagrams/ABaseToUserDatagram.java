package dragonsVillage.Datagrams;

import dragonsVillage.dtos.MapDTO;

import java.io.Serializable;

public abstract class ABaseToUserDatagram implements Serializable {
    private long mapToBlockID;
    private MapDTO mapDTOinstance;

    protected ABaseToUserDatagram(long mapToBlockID) {
        this.mapToBlockID = mapToBlockID;
    }

    public long getMapToBlockID() {
        return mapToBlockID;
    }

    public void setMapToBlockID(long mapToBlockID) {
        this.mapToBlockID = mapToBlockID;
    }

    public MapDTO getMapDTOinstance() {
        return mapDTOinstance;
    }

    public void setMapDTOinstance(MapDTO mapDTOinstance) {
        this.mapDTOinstance = mapDTOinstance;
    }
}
