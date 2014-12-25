package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.Datagrams.responseDatagram.ResponseUserMoveDatagram;
import dragonsVillage.abstracts.ADatagram;

public class PlayerMoveDatagram extends ADatagram<ResponseUserMoveDatagram> {
    public PlayerMoveDatagram(int id, ResponseUserMoveDatagram datagram) {
        super(id, datagram);
    }
}
