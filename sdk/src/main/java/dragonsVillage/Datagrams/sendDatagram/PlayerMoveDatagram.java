package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.Datagrams.basicDatagram.MoveDatagram;
import dragonsVillage.abstracts.ADatagram;

import java.io.Serializable;

public class PlayerMoveDatagram extends ADatagram<MoveDatagram> {
    public PlayerMoveDatagram(int id, MoveDatagram datagram) {
        super(id, datagram);
    }
}
