package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.Datagrams.basicDatagram.MoveDatagram;
import dragonsVillage.abstracts.ADatagram;

public class PlayerMoveDatagram extends ADatagram<MoveDatagram> {
    public PlayerMoveDatagram(int id, MoveDatagram datagram) {
        super(id, datagram);
    }
}
