package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.dtos.DragonDTO;

import java.io.Serializable;
import java.util.ArrayList;

public class AddDragonsDatagram implements Serializable {
    private Object[] dragonDTO;

    public AddDragonsDatagram(Object[] dragonDTO) {
        this.dragonDTO = dragonDTO;
    }

    public Object[] getDragonDTO() {
        return dragonDTO;
    }

    public void setDragonDTO(Object[] dragonDTO) {
        this.dragonDTO = dragonDTO;
    }
}
