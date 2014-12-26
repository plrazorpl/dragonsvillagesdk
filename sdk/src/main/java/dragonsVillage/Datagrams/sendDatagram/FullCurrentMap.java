package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.dtos.MapDTO;

import java.io.Serializable;

public class FullCurrentMap implements Serializable {

    private MapDTO mapDTO;

    public FullCurrentMap(MapDTO mapDTO){
        this.mapDTO = mapDTO;
    }

    public MapDTO getMapDTO() {
        return mapDTO;
    }

    public void setMapDTO(MapDTO mapDTO) {
        this.mapDTO = mapDTO;
    }
}
